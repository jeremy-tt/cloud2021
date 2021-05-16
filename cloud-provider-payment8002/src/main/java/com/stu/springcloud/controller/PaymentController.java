package com.stu.springcloud.controller;

import com.stu.springcloud.CommonResult;
import com.stu.springcloud.Payment;
import com.stu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment){
        int res = paymentService.add(payment);
        log.info("插入结果" + res);

        if(res > 0){
            return new CommonResult(200,"插入数据库成功",res);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentId(id);
        log.info("查询结果" + payment);

        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort:  "+serverPort,payment);
        }else {
            return new CommonResult(444,"没有该记录，查询id" + id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

}
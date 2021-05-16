package com.stu.springcloud.service.impl;


import com.stu.springcloud.Payment;
import com.stu.springcloud.dao.PaymentDao;
import com.stu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int add(Payment payment){
        return paymentDao.add(payment);
    }

    public Payment getPaymentId(@Param("id")Long id){
        return paymentDao.getPaymentId(id);
    }
}

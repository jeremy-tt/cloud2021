package com.stu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String PaymentInfo_ok(Integer id) {
        return "---PaymentFallbackService fall back- PaymentInfo_ok,o(╥﹏╥)o";
    }

    @Override
    public String PaymentInfo_TimeOut(Integer id) {
        return "---PaymentFallbackService fall back-PaymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

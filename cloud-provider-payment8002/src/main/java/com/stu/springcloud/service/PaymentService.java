package com.stu.springcloud.service;

import com.stu.springcloud.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int add(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}

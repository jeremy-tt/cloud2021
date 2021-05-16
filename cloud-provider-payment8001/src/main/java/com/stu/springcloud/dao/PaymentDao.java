package com.stu.springcloud.dao;

import com.stu.springcloud.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int add(Payment payment);

    public Payment getPaymentId(@Param("id")Long id);
}

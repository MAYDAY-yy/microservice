package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {
    List<Payment> findAll();

    Payment findById(Long uid);

    boolean addPayment(Payment payment);
}

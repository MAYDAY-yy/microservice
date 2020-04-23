package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.entities.Payment;
import com.mengxuegu.springcloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mengxuegu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public boolean add(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public Payment get(long pid) {
        return  paymentMapper.findById(pid);
    }

    @Override
    public List<Payment> list() {
        return paymentMapper.findAll();
    }
}

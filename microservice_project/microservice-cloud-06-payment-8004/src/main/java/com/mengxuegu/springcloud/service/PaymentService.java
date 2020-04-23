package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Payment;

import java.util.List;

public interface PaymentService {
    boolean add(Payment payment);

    Payment get(long pid);

    List<Payment> list();
}

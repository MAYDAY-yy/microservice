package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Payment;
import com.mengxuegu.springcloud.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payment/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Payment payment) {
        return paymentService.add(payment);
    }

    @RequestMapping(value = "/payment/get/{pid}", method = RequestMethod.GET)
    public Payment get(@PathVariable("pid") Long pid) {
        return paymentService.get(pid);
    }

    @RequestMapping(value = "/payment/list", method = RequestMethod.GET)
    public List<Payment> list() {
        return paymentService.list();
    }
}

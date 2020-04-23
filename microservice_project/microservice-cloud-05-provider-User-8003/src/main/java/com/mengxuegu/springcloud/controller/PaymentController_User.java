package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class PaymentController_User {
    private static final String REST_URL_PREFIX = "http://localhost:8004";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/payment/add")
    public boolean add(Payment payment) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/payment/add", payment, Boolean.class);
    }

    @RequestMapping(value = "/user/payment/get/{id}")
    public Payment get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/payment/get/" + id, Payment.class);
    }

    @RequestMapping(value = "/user/payment/list")
    public List<Payment> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/payment/list", List.class);
    }

}

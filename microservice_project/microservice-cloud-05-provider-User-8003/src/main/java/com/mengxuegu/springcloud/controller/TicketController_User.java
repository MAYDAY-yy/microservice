package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Order;
import com.mengxuegu.springcloud.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TicketController_User {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/ticket/add")
    public boolean add(Ticket ticket) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/ticket/add", ticket, Boolean.class);
    }

    //订票
    @RequestMapping(value = "/user/ticket/book")
    public Boolean book(Ticket ticket) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/ticket/book", ticket, Boolean.class);
    }

    //创建订单
    @RequestMapping(value = "/user/ticket/order")
    public boolean order(Order order) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/ticket/order", order, Boolean.class);
    }

    @RequestMapping(value = "/user/ticket/get/{id}")
    public Ticket get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/ticket/get/" + id, Ticket.class);
    }

    @RequestMapping(value = "/user/ticket/list")
    public List<Ticket> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/ticket/list", List.class);
    }

}

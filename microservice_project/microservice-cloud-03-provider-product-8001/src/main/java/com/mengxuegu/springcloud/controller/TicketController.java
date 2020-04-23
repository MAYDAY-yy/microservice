package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Order;
import com.mengxuegu.springcloud.entities.Ticket;
import com.mengxuegu.springcloud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired(required = true)
    private TicketService ticketService;

    @RequestMapping(value = "/ticket/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Ticket ticket) {
        return ticketService.add(ticket);
    }

    @RequestMapping(value = "/ticket/book", method = RequestMethod.POST)
    public boolean book(@RequestBody Ticket ticket) {
        return ticketService.book(ticket);
    }

    //订单
    @RequestMapping(value = "/ticket/order", method = RequestMethod.POST)
    public boolean order(@RequestBody Order order) {
        return ticketService.order(order);
    }

    @RequestMapping(value = "/ticket/get/{id}", method = RequestMethod.GET)
    public Ticket get(@PathVariable("id") Long id) {
        return ticketService.get(id);
    }

    @RequestMapping(value = "/ticket/list", method = RequestMethod.GET)
    public List<Ticket> list() {
        return ticketService.list();
    }
}

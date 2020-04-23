package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.entities.Order;
import com.mengxuegu.springcloud.entities.Ticket;
import com.mengxuegu.springcloud.mapper.TicketMapper;
import com.mengxuegu.springcloud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketMapper ticketMapper;

    @Override
    public boolean add(Ticket ticket) {
        return ticketMapper.addTicket(ticket);
    }

    @Override
    public Ticket get(Long id) {
        return ticketMapper.findById(id);
    }

    @Override
    public boolean book(Ticket ticket) {
        return ticketMapper.bookTicket(ticket);
    }

    @Override
    public boolean order(Order order) {
        return ticketMapper.addOrder(order);
    }

    @Override
    public List<Ticket> list() {
        return ticketMapper.findAll();
    }
}

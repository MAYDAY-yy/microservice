package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Order;
import com.mengxuegu.springcloud.entities.Ticket;

import java.util.List;

public interface TicketService {
    boolean add(Ticket ticket);

    Ticket get(Long id);

    boolean book(Ticket ticket);

    boolean order(Order order);

    List<Ticket> list();
}

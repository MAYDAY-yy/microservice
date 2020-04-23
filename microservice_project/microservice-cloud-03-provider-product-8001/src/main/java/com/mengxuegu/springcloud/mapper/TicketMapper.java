package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Order;
import com.mengxuegu.springcloud.entities.Ticket;

import java.util.List;

public interface TicketMapper {
    Ticket findById(Long tid);

    List<Ticket> findAll();

    boolean addTicket(Ticket ticket);
    boolean bookTicket(Ticket ticket);
    boolean addOrder(Order order);
}

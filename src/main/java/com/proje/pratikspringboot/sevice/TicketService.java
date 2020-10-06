package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Ticket;

import java.util.List;

public interface TicketService
{
    List<Ticket> findAll();
    void createTicket(Ticket ticket);
    void deleteById(Long id);


}

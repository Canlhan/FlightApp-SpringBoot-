package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Ticket;

import java.util.List;

public interface TicketService
{
    List<Ticket> findAll();
    void createtick(Ticket ticket);
    void createTicket(Ticket ticket,Long flightId,Long routeId);
    void deleteById(Long id);


}

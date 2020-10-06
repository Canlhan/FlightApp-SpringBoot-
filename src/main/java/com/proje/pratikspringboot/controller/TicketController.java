package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.sevice.TicketService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketController
{
    private final TicketService ticketService;

    @RequestMapping(method = RequestMethod.GET,value ="/tickets")
    public ResponseEntity<List<Ticket>>  getAll()
    {
        List<Ticket> tickets=ticketService.findAll();
        return ResponseEntity.ok(tickets);
    }

    @RequestMapping(method =RequestMethod.POST,value ="/ticket")
    public ResponseEntity<?> createTicket(@RequestBody Ticket ticket)
    {
        ticketService.createTicket(ticket);
        return ResponseEntity.ok().build();
    }

}

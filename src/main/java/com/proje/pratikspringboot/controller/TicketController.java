package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.sevice.TicketService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method =RequestMethod.POST,value ="/ticket/{id}/route/{routeId}")
    public ResponseEntity<?> createTicket(@RequestBody Ticket ticket, @PathVariable Long id,@PathVariable Long routeId)
    {
        ticketService.createTicket(ticket,id,routeId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method =RequestMethod.POST,value ="/ticket")
    public ResponseEntity<?> createTicket(@RequestBody Ticket ticket)
    {
        ticketService.createtick(ticket);
        return ResponseEntity.ok().build();
    }



}

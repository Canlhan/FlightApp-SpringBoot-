package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Flight;
import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.repositories.FlightRepository;
import com.proje.pratikspringboot.repositories.RouteRepository;
import com.proje.pratikspringboot.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    private final FlightRepository flightRepository;

    private final RouteRepository routeRepository;

    @Override
    public List<Ticket> findAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public void createtick(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void createTicket(Ticket ticket,Long flightId,Long routeId) {

        Ticket ticket1=new Ticket();
        Flight flight=flightRepository.findById(flightId).orElse(null);
        Route route=routeRepository.findById(routeId).orElse(null);

        ticket1.setTicketnum(ticket.getTicketnum());
        ticket1.setFlight(flight);

        String rota=route.getFrom()+route.getTo();
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");

         Date dt=new Date();
         ticket1.setRota(rota);
        ticket1.setTime(dateFormat.format(dt));


        ticketRepository.save(ticket1);
    }

    @Override
    public void deleteById(Long id) {
        ticketRepository.deleteById(id);
    }


}

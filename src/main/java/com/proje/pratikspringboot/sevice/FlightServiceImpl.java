package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.domain.Flight;
import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.repositories.AirplaneCompanyRepository;
import com.proje.pratikspringboot.repositories.FlightRepository;
import com.proje.pratikspringboot.repositories.RouteRepository;
import com.proje.pratikspringboot.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FlightServiceImpl  implements FlightService{

    private final FlightRepository flightRepository;

    private final RouteRepository routeRepository;

    private final AirplaneCompanyRepository airplaneCompanyRepository;

    private final TicketRepository ticketRepository;
    @Override
    public List<Flight> findAll() {
        return (List<Flight>) flightRepository.findAll();
    }

    @Override
    public void createFlight(Flight flight, Long routeId) {
        Route route=routeRepository.findById(routeId).orElse(null);
        AirplaneCompany airplaneCompany=airplaneCompanyRepository.findByaircompanyName("thy");
        flight.setRoute(route);
        flight.setAirplaneCompany(airplaneCompany);
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }


    @Override
    public Flight findById(Long id) {

        return flightRepository.findById(id).orElse(null);
    }


}

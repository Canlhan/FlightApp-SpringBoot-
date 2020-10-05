package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Flight;
import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.repositories.FlightRepository;
import com.proje.pratikspringboot.repositories.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FlightServiceImpl  implements FlightService{

    private final FlightRepository flightRepository;

    private final RouteRepository routeRepository;

    @Override
    public List<Flight> findAll() {
        return (List<Flight>) flightRepository.findAll();
    }

    @Override
    public void createFlight(Flight flight, Long routeId) {
        Route route=routeRepository.findById(routeId).orElse(null);

        flight.setRoute(route);
        routeRepository.save(route);
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

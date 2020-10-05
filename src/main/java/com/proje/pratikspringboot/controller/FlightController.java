package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Flight;
import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.sevice.FlightService;
import com.proje.pratikspringboot.sevice.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class FlightController
{
    private final FlightService flightService;


    @RequestMapping(method = RequestMethod.GET,value ="/flights")
    public ResponseEntity<List<Flight>> getAll()
    {
        List<Flight> flights=flightService.findAll();
        return ResponseEntity.ok(flights);
    }

    @RequestMapping(method = RequestMethod.POST,value ="/flight/new/{id}")
    public ResponseEntity<?> createFlight(@RequestBody Flight flight, @PathVariable  Long id)
    {
        flightService.createFlight(flight,id);
        return ResponseEntity.ok().build();
    }
}

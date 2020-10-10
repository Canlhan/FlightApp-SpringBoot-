package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Flight;

import java.util.List;

public interface FlightService{
    List<Flight> findAll();
    void createFlight(Flight flight,Long routeId);
    void deleteFlight(Long id);
    Flight findById(Long id);
    void addAirplaneCompany(Flight flight,Long companyId);

}

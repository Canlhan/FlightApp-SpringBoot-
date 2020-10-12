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
import java.util.Optional;

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
        flight.setRoute(route);
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

    @Override
    public void addAirplaneCompany(Flight flight, Long companyId) {
        Flight fligth2=new Flight();

       AirplaneCompany airplaneCompany=airplaneCompanyRepository.findById(companyId).orElse(null);
        flightRepository.findAll().forEach(item->{
            if(item.getFlightname().matches(flight.getFlightname()))
            {
               item.setAirplaneCompany(airplaneCompany);
                System.out.println(airplaneCompany.getAircompanyName());
                flightRepository.save(item);
            }
        });

        fligth2.setFlightname(flight.getFlightname());
        fligth2.setAirplaneCompany(airplaneCompany);






    }


}

package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository  extends CrudRepository<Flight,Long>
{

}
package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository  extends CrudRepository<Route,Long> {
}

package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.repositories.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;


    @Override
    public void createRoute(Route route) {
       routeRepository.save(route);
    }

    @Override
    public Route findById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }
}

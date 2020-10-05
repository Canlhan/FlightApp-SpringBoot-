package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Route;

public interface RouteService
{
    void createRoute(Route route);
    Route findById(Long id);
}


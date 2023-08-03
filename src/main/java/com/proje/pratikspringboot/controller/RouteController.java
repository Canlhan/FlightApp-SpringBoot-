package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Route;
import com.proje.pratikspringboot.sevice.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class
RouteController
{
    private final RouteService routeService;



    
    @RequestMapping(method = RequestMethod.POST,value ="/route/new")
    public ResponseEntity<?> createRoute(@RequestBody Route route)
    {
        routeService.createRoute(route);
       return ResponseEntity.ok().build();
    }
    @RequestMapping(method = RequestMethod.POST,value ="/route/{id}")
    public ResponseEntity<Route>  routefindByID(@PathVariable Long id)
    {
        Route route=routeService.findById(id);
        return ResponseEntity.ok(route);
    }
}

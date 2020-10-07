package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.sevice.AirplaneService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class AirplaneController
{
    private final AirplaneService airplaneService;

    @RequestMapping(method = RequestMethod.GET,value ="/airplane")
    public ResponseEntity<List<Airplane>>  getAirplanes()
    {
        List<Airplane> airplanes=airplaneService.airplanes();
        return ResponseEntity.ok(airplanes);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/new")
    public void addAirplane(@RequestBody Airplane airplane)
    {

        airplaneService.addAirplane(airplane);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/new/{id}")
    public void addAirplane(@RequestBody Airplane airplane,@PathVariable Long id)
    {
        //buradaki id  airplanecompany nesnesi bulup  airplane içindeki companies setine eklemek için aldım
            airplaneService.addAirplane(airplane,id);
    }


}

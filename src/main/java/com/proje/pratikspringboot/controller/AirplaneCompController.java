package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.sevice.AirplaneCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AirplaneCompController
{
    public final AirplaneCompanyService airplaneCompanyService;



    @RequestMapping(method = RequestMethod.POST,value = "/neww")
    public  void saveAirplaneCompany (@RequestBody AirplaneCompany airplaneCompany)
    {
      airplaneCompanyService.addAirplaneCompany(airplaneCompany);
    }

    @RequestMapping(method = RequestMethod.GET,value ="/companies")
    public ResponseEntity<List<AirplaneCompany>> getAllCompany()
    {
        List<AirplaneCompany> companies=airplaneCompanyService.getAllCompanies();
        return ResponseEntity.ok(companies);
    }

    @RequestMapping(method=RequestMethod.POST,value ="/company/{id}/{companyid}")
    public ResponseEntity<?> addAirplane(@PathVariable  Long id,@PathVariable  Long companyid)
    {
        airplaneCompanyService.airplanes(id,companyid);
        return ResponseEntity.ok().build();
    }
}

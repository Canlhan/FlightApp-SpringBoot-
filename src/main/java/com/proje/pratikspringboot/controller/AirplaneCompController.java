package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.sevice.AirplaneCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}

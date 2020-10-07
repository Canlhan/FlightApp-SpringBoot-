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

    @RequestMapping(method = RequestMethod.POST,value = "/neww/{id}")
    public  void saveAirplaneCompany (@RequestBody AirplaneCompany airplaneCompany, @PathVariable Long id)
    {
      airplaneCompanyService.addAirplaneCompany(airplaneCompany,id);
    }

    @RequestMapping(method = RequestMethod.GET,value ="/companies")
    public ResponseEntity<List<AirplaneCompany>> getAllCompany()
    {
        List<AirplaneCompany> companies=airplaneCompanyService.getAllCompanies();
        return ResponseEntity.ok(companies);
    }
}

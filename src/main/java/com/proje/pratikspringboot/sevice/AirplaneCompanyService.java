package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;

import java.util.List;

public interface AirplaneCompanyService
{
    AirplaneCompany addAirplaneCompany(AirplaneCompany airplaneCompany,Long id);
    void deleteAirplaneCompany(Long airplanecompanyId);
    List<AirplaneCompany> getAllCompanies();
    List<Airplane> airplanes(Long AirplaneId,AirplaneCompany airplaneCompany);

}

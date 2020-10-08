package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;

import java.util.List;

public interface AirplaneCompanyService
{
    AirplaneCompany addAirplaneCompany(AirplaneCompany airplaneCompany);
    void deleteAirplaneCompany(Long airplanecompanyId);
    List<AirplaneCompany> getAllCompanies();
    void airplanes(Long AirplaneId,Long CompanyId);


}

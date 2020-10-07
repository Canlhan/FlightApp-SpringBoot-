package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.repositories.AirplaneCompanyRepository;
import com.proje.pratikspringboot.repositories.AirplaneRepository;
import com.proje.pratikspringboot.sevice.AirplaneService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class AirplaServiceImpl implements AirplaneService {

    private final  AirplaneRepository airplaneRepository;

    private final AirplaneCompanyRepository airplaneCompanyRepository;

    @Override
    public Airplane addAirplane(Airplane requestAirplane) {
        return airplaneRepository.save(requestAirplane);
    }

    @Override
    public Airplane addAirplane(Airplane requestAirplane,Long companyId)
    {
        AirplaneCompany airplaneCompany=airplaneCompanyRepository.findById(companyId).orElse(null);
        requestAirplane.getAirplanecompanies().add(airplaneCompany);

        return airplaneRepository.save(requestAirplane);
    }

    @Override
    public void deleteAirplane(Long airplaneId) {

        airplaneRepository.deleteById(airplaneId);
    }

    @Override
    public List<Airplane> airplanes() {


        return (List<Airplane>) airplaneRepository.findAll();
    }


}

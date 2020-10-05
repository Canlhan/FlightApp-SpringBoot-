package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.repositories.AirplaneCompanyRepository;
import com.proje.pratikspringboot.repositories.AirplaneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AirplaneCompanyServiceImpl implements AirplaneCompanyService {

    private final AirplaneCompanyRepository airplaneCompanyRepository;
    private final AirplaneRepository airplaneRepository;

   @Override
    public AirplaneCompany addAirplaneCompany(AirplaneCompany airplaneCompany) {
        return  airplaneCompanyRepository.save(airplaneCompany);
    }

    @Override
    public void deleteAirplaneCompany(Long airplanecompanyId) {
        airplaneCompanyRepository.deleteById(airplanecompanyId);
    }

    @Override
    public List<AirplaneCompany> getAllCompanies() {
       return (List<AirplaneCompany>) airplaneCompanyRepository.findAll();
    }

    @Override
    public List<Airplane> airplanes(Long AirplaneId,AirplaneCompany airplaneCompany) {
        Optional<Airplane> airplane=airplaneRepository.findById(AirplaneId);
        return null;
    }
}

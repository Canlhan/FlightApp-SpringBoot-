package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;
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


    @Override
    public Airplane addAirplane(Airplane requestAirplane) {
        return airplaneRepository.save(requestAirplane);
    }

    @Override
    public void deleteAirplane(Long airplaneId) {

        airplaneRepository.deleteById(airplaneId);
    }

    @Override
    public List<Airplane> airplanes() {
       List<Airplane> airplanes= (List<Airplane>) airplaneRepository.findAll();
       Airplane adnanmenderes=new Airplane();
       adnanmenderes.setAirplaneName("adnan menderes");
       adnanmenderes.setId(1L);
       airplanes.add(adnanmenderes);
        return airplanes;
    }


}

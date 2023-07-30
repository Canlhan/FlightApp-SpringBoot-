package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;

import java.util.List;

public interface AirplaneService  {

    void addAirplane(Airplane requestAirplane,Long companyId);
    Airplane addAirplane(Airplane airplane);
    void deleteAirplane(Long airplaneId);
    List<Airplane> airplanes();

}

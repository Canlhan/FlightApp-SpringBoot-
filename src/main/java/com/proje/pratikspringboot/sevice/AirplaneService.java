package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;

import java.util.List;

public interface AirplaneService  {
    Airplane addAirplane(Airplane requestAirplane);
    void deleteAirplane(Long airplaneId);
    List<Airplane> airplanes();

}

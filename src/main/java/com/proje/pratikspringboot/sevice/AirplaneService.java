package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Airplane;

import java.util.List;

public interface AirplaneService  {
    Airplane addAirplane(Airplane requestAirplane);
    Airplane addAirplane(Airplane requestAirplane,Long companyId);
    void deleteAirplane(Long airplaneId);
    List<Airplane> airplanes();

}

package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneCompanyRepository extends CrudRepository<AirplaneCompany,Long>
{



}

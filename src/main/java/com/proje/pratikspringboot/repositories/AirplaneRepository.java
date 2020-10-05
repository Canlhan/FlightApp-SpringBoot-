package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository  extends CrudRepository<Airplane,Long>
{

}

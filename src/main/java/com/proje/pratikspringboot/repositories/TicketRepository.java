package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository  extends CrudRepository<Ticket,Long>
{

}

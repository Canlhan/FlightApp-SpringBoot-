package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Customer;
import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.repositories.CustomerRepository;
import com.proje.pratikspringboot.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final TicketRepository ticketRepository;


    @Override
    public List<Customer> findAll() {


        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer, Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        Customer customer1 = customerRepository.save(customer);

        if ( ticket != null) {
            ticket.getCustomers().add(customer);
            customer1.getTickets().add(ticket);
        }
    }


    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}

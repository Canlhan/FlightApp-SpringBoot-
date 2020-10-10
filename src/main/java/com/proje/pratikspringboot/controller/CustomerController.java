package com.proje.pratikspringboot.controller;

import com.proje.pratikspringboot.domain.Customer;
import com.proje.pratikspringboot.domain.Ticket;
import com.proje.pratikspringboot.sevice.CustomerService;
import com.proje.pratikspringboot.sevice.TicketService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController
{
    private final CustomerService customerService;


    @RequestMapping(method = RequestMethod.GET,value ="/customers")
    public ResponseEntity<List<Customer>>  getAll()
    {
        List<Customer> customers=customerService.findAll();
        return ResponseEntity.ok(customers);
    }

    @RequestMapping(method = RequestMethod.POST,value ="/customer/{id}")
    public ResponseEntity<?> createCustomer( @RequestBody  Customer customer,@PathVariable Long id)
    {
        customerService.saveCustomer(customer,id);
        return ResponseEntity.ok().build();
    }












}

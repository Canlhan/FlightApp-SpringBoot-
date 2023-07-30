package com.proje.pratikspringboot.sevice;

import com.proje.pratikspringboot.domain.Customer;

import java.util.List;

public interface CustomerService
{

    List<Customer> findAll();
    void saveCustomer(Customer customer,Long ticketId);
    void deleteCustomer(Long id);



}

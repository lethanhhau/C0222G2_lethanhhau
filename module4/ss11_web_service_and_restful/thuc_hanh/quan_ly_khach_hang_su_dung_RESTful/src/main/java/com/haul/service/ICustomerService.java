package com.haul.service;

import com.haul.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Integer id);

    Customer save(Customer customer);

    void remove(Integer id);
}

package com.hau.repository;

import com.hau.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);
}

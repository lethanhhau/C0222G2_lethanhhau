package com.hau.service.impl;

import com.hau.model.Customer;
import com.hau.repository.ICustomerRepository;
import com.hau.repository.impl.CustomerRepositoryImpl;
import com.hau.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
   private ICustomerRepository iCustomerRepository =  new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
     iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void update(Customer customer) {
     iCustomerRepository.update(customer);
    }

    @Override
    public void remove(int id) {
     iCustomerRepository.remove(id);
    }
}

package com.hau.service.impl;

import com.hau.model.Customer;
import com.hau.repository.ICustomerRepository;
import com.hau.service.IAppUserService;
import com.hau.service.ICustomerService;
import com.hau.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public Customer getCustomerByUserName(String userName) {
        return iCustomerRepository.getCustomerByUserName(userName);
    }


    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Page<Customer> getListCustomer(Pageable pageable) {
        return iCustomerRepository.findAllCustomer(pageable);
    }


}
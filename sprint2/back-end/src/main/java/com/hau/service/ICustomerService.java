package com.hau.service;

import com.hau.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Customer getCustomerByUserName(String userName);

    void save(Customer customer);

    Page<Customer> getListCustomer(Pageable pageable);
}

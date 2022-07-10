package com.hau.service.customer;

import com.hau.model.customer.Customer;
import com.hau.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable, String searchValue);

    Optional<Customer> findById(Integer id);

    Customer save(Customer customer);

    void remove(Integer id);

    List<Customer> findAllCustomer();

}

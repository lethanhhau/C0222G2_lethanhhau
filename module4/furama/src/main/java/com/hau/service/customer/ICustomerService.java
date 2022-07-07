package com.hau.service.customer;

import com.hau.model.customer.Customer;
import com.hau.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ICustomerService extends IGeneralService<Customer> {


    List<Customer> findAllCustomer();
}

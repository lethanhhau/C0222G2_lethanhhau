package com.hau.service.customer;

import com.hau.model.customer.Customer;
import com.hau.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable, String searchValue) {
        return this.iCustomerRepository.findByNameCustomer(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {
        this.iCustomerRepository.delete(this.iCustomerRepository.getById(id));
    }

    @Override
    public List<Customer> findAllCustomer() {
        return this.iCustomerRepository.findAll();
    }
}

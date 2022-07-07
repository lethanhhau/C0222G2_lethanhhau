package com.hau.service.customer_type;

import com.hau.model.customer.Customer;
import com.hau.model.customer.CustomerType;
import com.hau.repository.customer_type.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerTypeService{

    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;


    @Override
    public Page<CustomerType> findAll(Pageable pageable, String searchValue) {
        return this.iCustomerTypeRepository.findNameCustomerType(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<CustomerType> findById(Integer id) {
        return this.iCustomerTypeRepository.findById(id);
    }

    @Override
    public void save(CustomerType customerType) {
        this.iCustomerTypeRepository.save(customerType);
    }

    @Override
    public void remove(Integer id) {
        this.iCustomerTypeRepository.delete(this.iCustomerTypeRepository.getById(id));
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return iCustomerTypeRepository.findAll();
    }
}

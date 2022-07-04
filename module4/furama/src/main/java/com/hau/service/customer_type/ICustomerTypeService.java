package com.hau.service.customer_type;

import com.hau.model.customer.CustomerType;
import com.hau.service.IGeneralService;

import java.util.List;

public interface ICustomerTypeService extends IGeneralService<CustomerType> {

    List<CustomerType> findAllCustomerType();
    
}

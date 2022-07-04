package com.hau.repository.customer_type;

import com.hau.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {

    @Query(value = " select * from customer_type where customer_type_name like :searchValue", nativeQuery = true)
    Page<CustomerType> findNameCustomerType(Pageable pageable, @Param("searchValue") String searchValue);
}

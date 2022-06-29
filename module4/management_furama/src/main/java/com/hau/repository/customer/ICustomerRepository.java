package com.hau.repository.customer;

import com.hau.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = " select * from customer where customer_name like :searchValue", nativeQuery = true)
    Page<Customer> findByKeyword(Pageable pageable,@Param("searchValue") String searchValue);
}


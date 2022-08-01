package com.hau.repository;

import com.hau.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = " select * from customer where customer_name like :searchValue", nativeQuery = true,
    countQuery = "select count(*) from (select * from customer where customer_name like :searchValue) temp_table")
    Page<Customer> findByNameCustomer(Pageable pageable, @Param("searchValue") String searchValue);
}
package com.hau.repository;

import com.hau.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address);

    Page<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address, Pageable pageInfo);
}

package com.hau.repository;

import com.hau.model.contract.Contract;
import com.hau.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract, Integer> {

    @Query(value = "select * from contract",nativeQuery = true)
    Page<Contract> getAllContract(Pageable pageable);
}


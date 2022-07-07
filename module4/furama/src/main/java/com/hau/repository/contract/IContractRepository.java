package com.hau.repository.contract;

import com.hau.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract, Integer> {

    @Query(value = " select * from contract where contract_id like :searchValue", nativeQuery = true,
            countQuery = "select count (*) from (select * from contract where contract_id like :searchValue) temp_table")
    Page<Contract> findByIdContract(Pageable pageable, @Param("searchValue") String searchValue);
}

package com.hau.repository.division;

import com.hau.model.customer.CustomerType;
import com.hau.model.employee.Division;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
    @Query(value = " select * from division where division_name like :searchValue", nativeQuery = true)
    Page<Division> findNameDivision(Pageable pageable, @Param("searchValue") String searchValue);
}

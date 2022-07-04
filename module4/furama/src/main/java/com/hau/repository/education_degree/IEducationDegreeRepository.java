package com.hau.repository.education_degree;

import com.hau.model.customer.CustomerType;
import com.hau.model.employee.EducationDegree;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {

    @Query(value = " select * from education_degree where education_degree_name like :searchValue", nativeQuery = true)
    Page<EducationDegree> findNameEducationDegree(Pageable pageable, @Param("searchValue") String searchValue);
}

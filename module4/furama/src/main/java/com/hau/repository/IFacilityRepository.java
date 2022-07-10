package com.hau.repository;

import com.hau.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {

    @Query(value = " select * from facility where facility_name like :searchValue", nativeQuery = true,
    countQuery = " select count(*) from (select * from facility where facility_name like :searchValue) temp_table ")
    Page<Facility> findByNameFacility(Pageable pageable, @Param("searchValue") String searchValue);
}

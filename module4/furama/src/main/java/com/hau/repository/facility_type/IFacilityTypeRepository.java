package com.hau.repository.facility_type;

import com.hau.model.facility.FacilityType;
import com.hau.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Integer> {

    @Query(value = " select * from facility_type where facility_type_name like :searchValue", nativeQuery = true,
    countQuery = " select count(*) from (select * from facility_type where facility_type_name like :searchValue) temp_table")
    Page<FacilityType> findByNameFacilityType(Pageable pageable, @Param("searchValue") String searchValue);
}

package com.hau.repository.rent_type;

import com.hau.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
    @Query(value = " select * from rent_type where rent_type_name like :searchValue", nativeQuery = true)
    Page<RentType> findByNameRentType(Pageable pageable, @Param("searchValue") String searchValue);
}

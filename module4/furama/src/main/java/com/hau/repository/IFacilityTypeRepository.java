package com.hau.repository;

import com.hau.model.facility.FacilityType;
import com.hau.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Integer> {

}

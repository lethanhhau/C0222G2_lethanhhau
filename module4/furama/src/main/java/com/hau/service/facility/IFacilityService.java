package com.hau.service.facility;

import com.hau.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable, String searchValue);

    Optional<Facility> findById(Integer id);

    Facility save(Facility facility);

    void remove(Integer id);

    List<Facility> findAllFacility();
}

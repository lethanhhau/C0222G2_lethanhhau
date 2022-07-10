package com.hau.service.rent_type;

import com.hau.model.facility.Facility;
import com.hau.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IRentTypeService {

    List<RentType> findAll();
}

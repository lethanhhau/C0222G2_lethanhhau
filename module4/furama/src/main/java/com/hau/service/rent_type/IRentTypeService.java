package com.hau.service.rent_type;

import com.hau.model.facility.RentType;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IRentTypeService extends IGeneralService<RentType> {
    List<RentType> findAllRentType();
}

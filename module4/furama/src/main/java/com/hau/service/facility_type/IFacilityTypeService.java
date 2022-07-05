package com.hau.service.facility_type;

import com.hau.model.facility.FacilityType;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IFacilityTypeService extends IGeneralService<FacilityType> {
    List<FacilityType> findAllFacilityType();
}

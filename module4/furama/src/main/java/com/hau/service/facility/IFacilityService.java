package com.hau.service.facility;

import com.hau.model.facility.Facility;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IFacilityService extends IGeneralService<Facility> {
    List<Facility> findAllFacility();
}

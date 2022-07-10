package com.hau.service.attach_facility;

import com.hau.model.contract.AttachFacility;
import com.hau.repository.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService{

    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return this.iAttachFacilityRepository.findAll();
    }
}

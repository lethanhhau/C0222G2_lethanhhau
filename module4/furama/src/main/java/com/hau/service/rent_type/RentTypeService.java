package com.hau.service.rent_type;

import com.hau.model.facility.RentType;
import com.hau.repository.IRentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService{

    @Autowired
    private IRentTypeRepository iRentTypeRepository;


    @Override
    public List<RentType> findAll() {
        return this.iRentTypeRepository.findAll();
    }
}

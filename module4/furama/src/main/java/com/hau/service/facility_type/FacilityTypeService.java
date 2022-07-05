package com.hau.service.facility_type;

import com.hau.model.facility.FacilityType;
import com.hau.repository.facility_type.IFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityTypeService implements IFacilityTypeService{
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public Iterable<FacilityType> findAll(Pageable pageable, String searchValue) {
        return this.iFacilityTypeRepository.findByNameFacilityType(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<FacilityType> findById(Integer id) {
        return this.iFacilityTypeRepository.findById(id);
    }

    @Override
    public void save(FacilityType facilityType) {
        this.iFacilityTypeRepository.save(facilityType);
    }

    @Override
    public void remove(Integer id) {
        this.iFacilityTypeRepository.delete(this.iFacilityTypeRepository.getById(id));
    }

    @Override
    public List<FacilityType> findAllFacilityType() {
        return this.iFacilityTypeRepository.findAll();
    }
}

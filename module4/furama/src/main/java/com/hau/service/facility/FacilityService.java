package com.hau.service.facility;

import com.hau.model.facility.Facility;
import com.hau.repository.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService{
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable, String searchValue) {
        return this.iFacilityRepository.findByNameFacility(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Facility> findById(Integer id) {
        return this.iFacilityRepository.findById(id);
    }

    @Override
    public Facility save(Facility facility) {
        return this.iFacilityRepository.save(facility);
    }

    @Override
    public void remove(Integer id) {
        this.iFacilityRepository.delete(this.iFacilityRepository.getById(id));
    }

    @Override
    public List<Facility> findAllFacility() {
        return this.iFacilityRepository.findAll();
    }

}

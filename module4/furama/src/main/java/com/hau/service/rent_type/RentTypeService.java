package com.hau.service.rent_type;

import com.hau.model.facility.RentType;
import com.hau.repository.rent_type.IRentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentTypeService implements IRentTypeService{

    @Autowired
    private IRentTypeRepository iRentTypeRepository;

    @Override
    public Iterable<RentType> findAll(Pageable pageable, String searchValue) {
        return this.iRentTypeRepository.findByNameRentType(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<RentType> findById(Integer id) {
        return this.iRentTypeRepository.findById(id);
    }

    @Override
    public void save(RentType rentType) {
        this.iRentTypeRepository.save(rentType);
    }

    @Override
    public void remove(Integer id) {
        this.iRentTypeRepository.delete(this.iRentTypeRepository.getById(id));
    }

    @Override
    public List<RentType> findAllRentType() {
        return this.iRentTypeRepository.findAll();
    }
}

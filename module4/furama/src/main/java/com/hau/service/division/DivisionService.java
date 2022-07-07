package com.hau.service.division;

import com.hau.model.employee.Division;
import com.hau.repository.division.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionService implements IDivisionService{
    @Autowired
    private IDivisionRepository iDivisionRepository;

    @Override
    public Page<Division> findAll(Pageable pageable, String searchValue) {
        return this.iDivisionRepository.findNameDivision(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Division> findById(Integer id) {
        return this.iDivisionRepository.findById(id);
    }

    @Override
    public void save(Division division) {
        this.iDivisionRepository.save(division);
    }

    @Override
    public void remove(Integer id) {
        this.iDivisionRepository.delete(this.iDivisionRepository.getById(id));
    }

    @Override
    public List<Division> findAllDivision() {
        return this.iDivisionRepository.findAll();
    }
}

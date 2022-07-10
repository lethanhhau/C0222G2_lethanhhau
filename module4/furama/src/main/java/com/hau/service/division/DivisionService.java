package com.hau.service.division;

import com.hau.model.employee.Division;
import com.hau.repository.IDivisionRepository;
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
    public List<Division> findAll() {
        return this.iDivisionRepository.findAll();
    }
}

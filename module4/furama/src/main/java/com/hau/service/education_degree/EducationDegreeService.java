package com.hau.service.education_degree;

import com.hau.model.employee.EducationDegree;
import com.hau.repository.IEducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationDegreeService implements IEducationDegreeService{

    @Autowired
    private IEducationDegreeRepository iEducationDegreeRepository;


    @Override
    public List<EducationDegree> findAll() {
        return this.iEducationDegreeRepository.findAll();
    }
}

package com.hau.service.education_degree;

import com.hau.model.employee.EducationDegree;
import com.hau.repository.education_degree.IEducationDegreeRepository;
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
    public Page<EducationDegree> findAll(Pageable pageable, String searchValue) {
        return null;
    }

    @Override
    public Optional<EducationDegree> findById(Integer id) {
        return this.iEducationDegreeRepository.findById(id);
    }

    @Override
    public void save(EducationDegree educationDegree) {
        this.iEducationDegreeRepository.save(educationDegree);
    }

    @Override
    public void remove(Integer id) {
        this.iEducationDegreeRepository.delete(this.iEducationDegreeRepository.getById(id));
    }

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return this.iEducationDegreeRepository.findAll();
    }
}

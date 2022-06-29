package com.hau.service.education_degree;

import com.hau.model.employee.EducationDegree;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IEducationDegreeService extends IGeneralService<EducationDegree> {
    List<EducationDegree> findAllEducationDegree();
}

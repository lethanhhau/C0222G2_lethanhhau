package com.hau.service.division;

import com.hau.model.employee.Division;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IDivisionService extends IGeneralService<Division> {
    List<Division> findAllDivision();
}

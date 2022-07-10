package com.hau.controller.employee;


import com.hau.model.employee.Division;
import com.hau.model.employee.EducationDegree;
import com.hau.model.employee.Position;
import com.hau.service.division.IDivisionService;
import com.hau.service.education_degree.IEducationDegreeService;
import com.hau.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IPositionService positionService;

    @ModelAttribute("divisionList")
    public List<Division> getAllDivision() {
        return this.divisionService.findAll();
    }

    @ModelAttribute("educationDegreeList")
    public List<EducationDegree> getAllEducationDegree() {
        return this.educationDegreeService.findAll();
    }

    @ModelAttribute("positionList")
    public List<Position> getAllPosition() {
        return this.positionService.findAllPosition();
    }

    @GetMapping("/employee-list")
    public String goEmployee() {
        return "employee/list";
    }
}

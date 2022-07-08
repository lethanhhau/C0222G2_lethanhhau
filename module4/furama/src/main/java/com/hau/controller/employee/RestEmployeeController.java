package com.hau.controller.employee;

import com.hau.model.employee.Division;
import com.hau.model.employee.EducationDegree;
import com.hau.model.employee.Employee;
import com.hau.model.employee.Position;
import com.hau.service.division.IDivisionService;
import com.hau.service.education_degree.IEducationDegreeService;
import com.hau.service.employee.IEmployeeService;
import com.hau.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RestEmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IPositionService iPositionService;

    @ModelAttribute("divisions")
    public List<Division> divisions() {
        return this.iDivisionService.findAllDivision();
    }

    @ModelAttribute("educationDegrees")
    public List<EducationDegree> educationDegrees() {
        return this.iEducationDegreeService.findAllEducationDegree();
    }

    @ModelAttribute("positions")
    public List<Position> positions() {
        return this.iPositionService.findAllPosition();
    }



    @PostMapping("/rest/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(iEmployeeService.save(employee), HttpStatus.CREATED);
    }

    @GetMapping("/rest/employee")
    public ResponseEntity<Iterable<Employee>> allEmployee() {
        return new ResponseEntity<>(this.iEmployeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/rest/employee/home")
    public ResponseEntity<Page<Employee>> getAllEmployee(@PageableDefault(value = 5) Pageable pageable, Optional<String> searchValue) {
        String searchParam = searchValue.orElse("");
        Page<Employee> employeePage = this.iEmployeeService.findAll(pageable, searchParam);
        return new ResponseEntity<>(employeePage, HttpStatus.OK);
    }

    @DeleteMapping("/rest/employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
        Optional<Employee> employeeOptional = this.iEmployeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.iEmployeeService.remove(id);
        return new ResponseEntity<>(employeeOptional.get(), HttpStatus.NO_CONTENT);
    }

}

package com.hau.service.employee;

import com.hau.model.employee.Employee;
import com.hau.service.IGeneralService;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IEmployeeService extends IGeneralService<Employee> {

    List<Employee> findAllEmployee();
}

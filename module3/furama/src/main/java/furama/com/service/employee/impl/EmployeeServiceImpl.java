package furama.com.service.employee.impl;

import furama.com.model.*;

import furama.com.repository.employee.IEmployeeRepository;
import furama.com.repository.employee.impl.EmployeeRepositoryImpl;
import furama.com.service.employee.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public List<Position> getAllPosition() {
        return employeeRepository.getAllPosition();
    }

    @Override
    public List<EducationDegree> getAllEducationDegree() {
        return employeeRepository.getAllEducationDegree();
    }

    @Override
    public List<Division> getAllDivision() {
        return employeeRepository.getAllDivision();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int idEdit) {
        return employeeRepository.getEmployeeById(idEdit);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeRepository.editEmployee(employee);
    }

    @Override
    public List<Employee> searchEmployeeByNameAndAddress(String employeeNameSearchValue, String employeeAddressSearchValue) {
        return employeeRepository.searchEmployeeByNameAndAddress(employeeNameSearchValue, employeeAddressSearchValue);
    }
}


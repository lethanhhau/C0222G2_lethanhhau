package com.hau.service.employee;

import com.hau.model.employee.Employee;
import com.hau.repository.employee.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Iterable<Employee> findAll(Pageable pageable, String searchValue) {
        return this.iEmployeeRepository.findByNameEmployee(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return this.iEmployeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        this.iEmployeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        this.iEmployeeRepository.delete(this.iEmployeeRepository.getById(id));
    }
}

package com.hau.service.employee;

import com.hau.model.employee.Employee;
import com.hau.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable, String searchParam) {
        return this.iEmployeeRepository.findAll(pageable, "%" + searchParam + "%");
    }

    @Override
    public void save(Employee employee) {
        this.iEmployeeRepository.save(employee);
    }

    @Override
    public void delete(String idDelete) {
        this.iEmployeeRepository.delete(this.iEmployeeRepository.getById(Integer.valueOf(idDelete)));
    }

    @Override
    public Employee getById(String idEdit) {
        return this.iEmployeeRepository.findById(Integer.valueOf(idEdit)).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return this.iEmployeeRepository.findAll();
    }


}

package com.hau.repository.employee;

import com.hau.model.customer.Customer;
import com.hau.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = " select * from employee where employee_name like :searchValue", nativeQuery = true)
    Page<Employee> findByNameEmployee(Pageable pageable, @Param("searchValue") String searchValue);
}

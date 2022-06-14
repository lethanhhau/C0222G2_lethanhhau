package furama.com.service.employee;

import furama.com.model.*;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();

    List<Position> getAllPosition();

    List<EducationDegree> getAllEducationDegree();

    List<Division> getAllDivision();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int idEdit);

    void editEmployee(Employee employee);

    List<Employee> searchEmployeeByNameAndAddress(String EmployeeNameSearchValue, String EmployeeAddressSearchValue);
}


package furama.com.repository.employee;


import furama.com.model.Division;
import furama.com.model.EducationDegree;
import furama.com.model.Employee;
import furama.com.model.Position;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int idEdit);

    List<Position> getAllPosition();

    List<EducationDegree> getAllEducationDegree();

    List<Division> getAllDivision();

    void editEmployee(Employee employee);

    List<Employee> searchEmployeeByNameAndAddress(String employeeNameSearchValue, String employeeAddressSearchValue);
}

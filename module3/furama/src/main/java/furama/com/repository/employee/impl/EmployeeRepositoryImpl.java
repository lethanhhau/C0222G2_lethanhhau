package furama.com.repository.employee.impl;


import furama.com.model.Division;
import furama.com.model.EducationDegree;
import furama.com.model.Employee;
import furama.com.model.Position;
import furama.com.repository.connection.DBConnection;
import furama.com.repository.employee.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private DBConnection dbConnection = new DBConnection();
    private final String SELECT_ALL_EMPLOYEE = " select * from `employee` ";
    private final String SELECT_ALL_POSITION = "select * from `position`";
    private final String SELECT_ALL_EDUCATION_DEGREE = "select * from `education_degree`";
    private final String SELECT_ALL_DIVISION = "select * from `division`";
    private final String SELECT_EMPLOYEE = "select * from `employee` where `employee_id` = ?";
    private final String INSERT_EMPLOYEE = " INSERT INTO `employee` (`employee_name`, `employee_birthday`, " +
            " `employee_id_card` , `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, " +
            " `division_id`, `education_degree_id`, `position_id`) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String UPDATE_EMPLOYEE = "update employee set `employee_name` = ?, `employee_birthday` = ?, `employee_id_card` = ?, " +
            " `employee_salary` = ?, `employee_phone` = ?, `employee_email` = ?, `employee_address` = ?, `division_id` = ? " +
            " `education_degree_id` = ?, `position_id` = ? where employee_id = ?";

    private final String SELECT_EMPLOYEE_BY_NAME_AND_ADDRESS = " select * from employee where employee_name like ? and employee_address like ? ";


    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                String employeeBirthDay = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                Double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                int status = resultSet.getInt("status");

                Employee employee = new Employee(employeeId, employeeName, employeeBirthDay, employeeIdCard, employeeSalary, employeePhone,
                        employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, username, status);
                employeeList.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationDegreeId());
            preparedStatement.setInt(10, employee.getDivisionId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Employee getEmployeeById(int idEdit) {
        Employee employee = new Employee();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE);
            preparedStatement.setInt(1, idEdit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                String employeeBirthDay = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                Double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("position_id");
                String username = resultSet.getString("username");
                int status = resultSet.getInt("status");

                employee = new Employee(employeeId, employeeName, employeeBirthDay, employeeIdCard, employeeSalary, employeePhone,
                        employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, username, status);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employee;
    }

    @Override
    public List<Position> getAllPosition() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int positionId = resultSet.getInt("position_id");
                String positionName = resultSet.getString("position_name");
                int status = resultSet.getInt("status");
                Position position = new Position(positionId,positionName,status);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return positionList;
    }

    @Override
    public List<EducationDegree> getAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EDUCATION_DEGREE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int educationDegreeId = resultSet.getInt("education_degree_id");
                String educationDegreeName = resultSet.getString("education_degree_name");
                int status = resultSet.getInt("status");
                EducationDegree educationDegree = new EducationDegree(educationDegreeId,educationDegreeName,status);
                educationDegreeList.add(educationDegree);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return educationDegreeList;
    }

    @Override
    public List<Division> getAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DIVISION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int divisionId = resultSet.getInt("division_id");
                String divisionName = resultSet.getString("division_name");
                int status = resultSet.getInt("status");
                Division division = new Division(divisionId,divisionName,status);
                divisionList.add(division);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return divisionList;
    }

    @Override
    public void editEmployee(Employee employee) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);

            preparedStatement.setString(1,employee.getEmployeeName());
            preparedStatement.setString(2,employee.getEmployeeBirthday());
            preparedStatement.setString(3,employee.getEmployeeIdCard());
            preparedStatement.setDouble(4,employee.getEmployeeSalary());
            preparedStatement.setString(5,employee.getEmployeePhone());
            preparedStatement.setString(6,employee.getEmployeeEmail());
            preparedStatement.setString(7,employee.getEmployeeAddress());
            preparedStatement.setInt(8,employee.getPositionId());
            preparedStatement.setInt(9,employee.getEducationDegreeId());
            preparedStatement.setInt(10,employee.getDivisionId());
            preparedStatement.setInt(11,employee.getEmployeeId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Employee> searchEmployeeByNameAndAddress(String employeeNameSearchValue, String employeeAddressSearchValue) {
       List<Employee> employeeList = new ArrayList<>();
       Connection connection = dbConnection.getConnection();
       try {
           PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME_AND_ADDRESS);
           preparedStatement.setString(1,"%" + employeeNameSearchValue + "%");
           preparedStatement.setString(2,"%" + employeeAddressSearchValue + "%");
           ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               int employeeId = resultSet.getInt("employee_id");
               String employeeName = resultSet.getString("employee_name");
               String employeeBirthday = resultSet.getString("employee_birthday");
               String employeeIdCard = resultSet.getString("employee_id_card");
               Double employeeSalary = resultSet.getDouble("employee_salary");
               String employeePhone = resultSet.getString("employee_phone");
               String employeeEmail = resultSet.getString("employee_email");
               String employeeAddress = resultSet.getString("employee_address");
               int positionId = resultSet.getInt("division_id");
               int educationDegreeId = resultSet.getInt("education_degree_id");
               int divisionId = resultSet.getInt("position_id");
               String username = resultSet.getString("username");
               int status = resultSet.getInt("status");

               Employee employee = new Employee(employeeId,employeeName,employeeBirthday,employeeIdCard,employeeSalary,
                       employeePhone,employeeEmail,employeeAddress,positionId,educationDegreeId,divisionId,username,0);
               employeeList.add(employee);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }finally {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
        return employeeList;
    }
}

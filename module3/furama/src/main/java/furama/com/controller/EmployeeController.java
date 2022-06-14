package furama.com.controller;

import furama.com.model.*;
import furama.com.service.customer.ICustomerService;
import furama.com.service.customer.impl.CustomerServiceImpl;
import furama.com.service.employee.IEmployeeService;
import furama.com.service.employee.impl.EmployeeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeController", value = "/employee")
public class EmployeeController extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "search":
                searchByNameAndAddress(request,response);
            case "delete":
                break;
            default:
                showListEmployee(request, response);
                break;
        }
    }

    private void searchByNameAndAddress(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String employeeNameSearchValue = request.getParameter("employeeNameSearchValue");
        String employeeAddressSearchValue = request.getParameter("employeeAddressSearchValue");
        request.setAttribute("positionList", iEmployeeService.getAllPosition());
        request.setAttribute("educationDegreeList", iEmployeeService.getAllEducationDegree());
        request.setAttribute("divisionList", iEmployeeService.getAllDivision());
        request.setAttribute("employeeList", iEmployeeService.searchEmployeeByNameAndAddress(employeeNameSearchValue,employeeAddressSearchValue));
        request.setAttribute("employeeNameSearchValue",employeeNameSearchValue);
        request.setAttribute("employeeAddressSearchValue",employeeAddressSearchValue);
        request.getRequestDispatcher("employee/listEmployee.jsp").forward(request,response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Position> positionList = iEmployeeService.getAllPosition();
        List<EducationDegree> educationDegreeList = iEmployeeService.getAllEducationDegree();
        List<Division> divisionList = iEmployeeService.getAllDivision();
        request.setAttribute("employee",iEmployeeService.getEmployeeById(id));
        request.setAttribute("positionList",positionList);
        request.setAttribute("educationDegreeList",educationDegreeList);
        request.setAttribute("divisionList",divisionList);
        request.getRequestDispatcher("employee/editEmployee.jsp").forward(request,response);
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Position> positionList = iEmployeeService.getAllPosition();
        request.setAttribute("positionList", positionList);
        List<EducationDegree> educationDegreeList = iEmployeeService.getAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);
        List<Division> divisionList = iEmployeeService.getAllDivision();
        request.setAttribute("divisionList", divisionList);

        request.getRequestDispatcher("employee/createEmployee.jsp").forward(request,response);
    }


    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = iEmployeeService.getAllEmployee();
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("employee/listEmployee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "edit":
                editEmployee(request,response);
                break;

            default:
                break;
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response)throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String employeeName = request.getParameter("employeeName");
        String employeeBirthDay = request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));

        Employee employee = new Employee(id,employeeName, employeeBirthDay, employeeIdCard, employeeSalary, employeePhone,
                employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, null, 0);

        iEmployeeService.editEmployee(employee);
        response.sendRedirect("/employee");

    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response){
        String employeeName = request.getParameter("employeeName");
        String employeeBirthDay = request.getParameter("employeeBirthDay");
        String employeeIdCard = request.getParameter("employeeIdCard");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("Username");
        Employee employee = new Employee(employeeName, employeeBirthDay, employeeIdCard, employeeSalary, employeePhone,
                employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, username, 0);
        iEmployeeService.saveEmployee(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

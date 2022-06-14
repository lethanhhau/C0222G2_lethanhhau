package furama.com.controller;

import furama.com.model.Customer;
import furama.com.model.CustomerType;
import furama.com.service.customer.ICustomerService;
import furama.com.service.customer.impl.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerController", value = "/customer")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImpl();

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
                showFormEdit(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchCustomerByName(request, response);
                break;
            case "sort":
                sortByName(request, response);
                break;
            default:
                displayCustomer(request, response);
                break;
        }
    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = iCustomerService.sortByName();
            request.setAttribute("customerList", customerList);
            request.getRequestDispatcher("customer/listCustomer.jsp").forward(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customer", iCustomerService.findById(id));
        request.setAttribute("customerTypeList", customerTypeList);
        request.getRequestDispatcher("customer/editCustomer.jsp").forward(request, response);
    }

    private void searchCustomerByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        String customerSearchName = request.getParameter("customerSearchName");
        request.setAttribute("customerTypeList", iCustomerService.getAllCustomerType());
        request.setAttribute("customerList", iCustomerService.searchCustomerByName(customerSearchName));
        request.setAttribute("customerSearchName", customerSearchName);
        request.getRequestDispatcher("customer/listCustomer.jsp").forward(request, response);

    }


    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        iCustomerService.deleteCustomer(idDelete);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("customer/listCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("customer/createCustomer.jsp").forward(request, response);
        } catch (ServletException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;

            default:
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        int id = Integer.parseInt(request.getParameter("id"));
        Integer customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        Integer customerGender = Integer.parseInt(request.getParameter("customerGender"));
        String customerIdCard = request.getParameter("customerIdCard");
        String customerPhone = request.getParameter("customerPhone");
        String customerEmail = request.getParameter("customerEmail");
        String customerAddress = request.getParameter("customerAddress");

        Customer customer = new Customer(id, customerTypeId, customerName, customerBirthday, customerGender, customerIdCard,
                customerPhone, customerEmail, customerAddress, 0);

        Map<String, String> errors = iCustomerService.editCustomer(customer);
            if (errors.isEmpty()) {
                iCustomerService.editCustomer(customer);
                response.sendRedirect("/customer");
            }else {
                request.setAttribute("errors",errors);
                request.setAttribute("customer", customer);
                request.setAttribute("customerGender",customerGender);
                request.getRequestDispatcher("customer/createCustomer.jsp").forward(request,response);
        }
    }

    public void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);

        Integer customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        Integer customerGender = Integer.parseInt(request.getParameter("customerGender"));
        String customerIdCard = request.getParameter("customerIdCard");
        String customerPhone = request.getParameter("customerPhone");
        String customerEmail = request.getParameter("customerEmail");
        String customerAddress = request.getParameter("customerAddress");

        Customer customer = new Customer(customerTypeId, customerName, customerBirthday, customerGender, customerIdCard,
                customerPhone, customerEmail, customerAddress, 0);

        Map<String, String> errors = iCustomerService.addCustomer(customer);
        if (errors.isEmpty()) {
            response.sendRedirect("/customer");
        }else {
            request.setAttribute("errors",errors);
            request.setAttribute("customer", customer);
            request.setAttribute("customerGender",customerGender);
            request.getRequestDispatcher("customer/createCustomer.jsp").forward(request,response);
        }
    }

}

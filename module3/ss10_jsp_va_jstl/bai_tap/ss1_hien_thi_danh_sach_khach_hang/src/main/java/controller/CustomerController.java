package controller;


import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CustomerController",urlPatterns ="/customer")
public class CustomerController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("tài","01-2-1996","thanh hóa","https://mcdn.nhanh.vn/store/27639/ps/20181112/12182018121823_47bb4f26832fab6c6286b88ceab8cf65_564x564.jpg");
        customers[1] = new Customer("phương","20-4-1999","quảng trị","https://mcdn.nhanh.vn/store/27639/ps/20181112/12182018121823_47bb4f26832fab6c6286b88ceab8cf65_564x564.jpg");
        customers[2] = new Customer("luận","12-8-2001","đà-nẵng","https://mcdn.nhanh.vn/store/27639/ps/20181112/12182018121823_47bb4f26832fab6c6286b88ceab8cf65_564x564.jpg");
        customers[3] = new Customer("trí","14-8-1995","quảng trị","https://mcdn.nhanh.vn/store/27639/ps/20181112/12182018121823_47bb4f26832fab6c6286b88ceab8cf65_564x564.jpg");
        customers[4] = new Customer("hoàn","29-09-1995","kon tum","https://mcdn.nhanh.vn/store/27639/ps/20181112/12182018121823_47bb4f26832fab6c6286b88ceab8cf65_564x564.jpg");

        request.setAttribute("listCustomer",customers);
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }
}

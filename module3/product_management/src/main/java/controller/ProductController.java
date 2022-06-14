package controller;

import model.Category;
import model.Product;
import service.IProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    private IProductService iProductService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProduct(request, response);
                break;
            case "edit":
                showFromEditProduct(request, response);
                break;
            default:
                displayProduct(request, response);
                break;
        }
    }

    private void showFromEditProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Category> categoryList = iProductService.selectAllCategory();
        request.setAttribute("product", iProductService.findById(id));
        request.setAttribute("categoryList", categoryList);
        try {
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categoryList = iProductService.selectAllCategory();
        request.setAttribute("categoryList", categoryList);
        try {
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void displayProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = iProductService.selectAllProduct();
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("list.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request,response);
                break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categoryList = iProductService.selectAllCategory();
        int id =Integer.parseInt(request.getParameter("id"));
        String productName = request.getParameter("productName");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String describe = request.getParameter("describe");
        Integer categoryId = Integer.parseInt(request.getParameter("categoryId"));

        Product product = new Product(id,productName,price,quantity,color,describe,categoryId);
        iProductService.editProduct(product);
        response.sendRedirect("/product");
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categoryList = iProductService.selectAllCategory();
        request.setAttribute("categoryList", categoryList);

        String productName = request.getParameter("productName");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer quantity = Integer.parseInt("quantity");
        String color = request.getParameter("color");
        String describe = request.getParameter("describe");
        Integer categoryId = Integer.parseInt(request.getParameter("categoryId"));

        Product product = new Product(productName, price, quantity, color, describe, categoryId);
        iProductService.saveProduct(product);
        response.sendRedirect("/product");
    }
}

package controller;

import model.MatBang;
import service.IMatBangService;
import service.impl.MatBangServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MatBangController", value = "/matBang")
public class MatBangController extends HttpServlet {
    private IMatBangService iMatBangService = new MatBangServiceImpl();

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

            case "delete":
                deleteMatBang(request, response);
                break;
            case "sort":
                sortByDienTich(request, response);
            default:
                displayMatBang(request, response);
                break;
        }
    }

    private void sortByDienTich(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MatBang> matBangList = iMatBangService.sortByDienTich();
        request.setAttribute("matBangList", matBangList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void deleteMatBang(HttpServletRequest request, HttpServletResponse response) {
        String maMatBang = request.getParameter("maMatBang");
        iMatBangService.deleteMatBang(maMatBang);
        try {
            response.sendRedirect("/matBang");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    private void displayMatBang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MatBang> matBangList = iMatBangService.selectAllMatBang();
        request.setAttribute("matBangList", matBangList);
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
                createMatBang(request, response);
                break;
            case "edit":

                break;

            default:
                break;
        }
    }

    private void createMatBang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maMatBang = request.getParameter("");
        double dienTich = Double.parseDouble(request.getParameter(""));
        String trangThai = request.getParameter("");
        Integer tang = Integer.parseInt(request.getParameter(""));
        String loaiMatBang = request.getParameter("");
        Double giaTien = Double.parseDouble(request.getParameter(""));
        String ngayBatDau = request.getParameter("");
        String ngayKetThuc = request.getParameter("");

        MatBang matBang = new MatBang(maMatBang, dienTich, trangThai, tang, loaiMatBang, giaTien, ngayBatDau, ngayKetThuc);

        Map<String, String> errors = iMatBangService.addMatBang(matBang);
        if (errors.isEmpty()) {
            response.sendRedirect("/matBang");
        } else {
            request.setAttribute("errors", errors);
        }
    }
}

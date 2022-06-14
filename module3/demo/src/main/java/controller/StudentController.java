package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController", value = "/student")
public class StudentController extends HttpServlet {
    private IStudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                deleteStudent(request, response);
                break;
            case "search":
                findByNameAndId(request,response);
                break;
            default:
                showListStudent(request, response);
                break;
        }
    }

    private void findByNameAndId(HttpServletRequest request, HttpServletResponse response) {
        String nameSearch = request.getParameter("nameSearch");
        String idSearch = request.getParameter("idSearch");
        nameSearch = "%" + nameSearch + "%";
        idSearch = "%" + idSearch + "%";
        List<Student> studentList = studentService.findByNameAndId(nameSearch,idSearch);
        request.setAttribute("studentList",studentList);
    }

    private void showListStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = studentService.getAllStudent();
        //Đưa list student lên trang list.jsp để hiển thị
        request.setAttribute("listStudent", students);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idEdit = Integer.parseInt(request.getParameter("idEdit"));
        Student student = studentService.getStudentById(idEdit);
        // Truyền dữ liệu lên trang student-form-edit.jsp với key là vị trí truyền lên value là giá trị
        request.setAttribute("name", student.getName());
        request.setAttribute("point", student.getPoint());
        // Truyền lên trang nào
        request.getRequestDispatcher("student-form-edit.jsp").forward(request, response);
    }

    private void showFormCreate(HttpServletResponse response) throws IOException {
        //Chuyển trang đến form nhập dữ liệu
        response.sendRedirect("student-form-create.jsp");
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        //gọi service để delete
        studentService.deleteStudent(idDelete);
        response.sendRedirect("/student");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createStudent(request, response);
                break;
            case "edit":
                editStudent(request, response);
                break;
            default:
                break;
        }
    }

    private void editStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idEdit = Integer.parseInt(request.getParameter("idEdit"));
        String name = request.getParameter("name");
        double point = Double.parseDouble(request.getParameter("point"));
        Student student = new Student(idEdit, name, point);
        studentService.editStudent(student);
        response.sendRedirect("/student");
    }

    private void createStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Lấy dữ liệu từ student-form-create.jsp
        String name = request.getParameter("name");
        double point = Double.parseDouble(request.getParameter("point"));
        Student student = new Student(name, point);
        //Gọi service để xử lý nghiệp vụ
        studentService.saveStudent(student);
        //Trở về hiển thị lại dữ liệu lên trang list.jsp
        response.sendRedirect("/student");
    }

}

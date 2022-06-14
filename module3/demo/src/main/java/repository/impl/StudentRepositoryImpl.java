package repository.impl;

import connection.DBConnection;
import model.Student;
import repository.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
    private DBConnection dbConnection = new DBConnection();

    private final String SELECT_ALL_STUDENT = " select * from `student` ";
    private final String INSERT_STUDENT = " INSERT INTO `student` (`name`, `point`) " +
            " VALUES (?, ?); ";
    private final String DELETE_STUDENT = " delete from student " +
            " where id = ? ";
    private final String SELECT_STUDENT = " select * from student where id = ?; ";
    private final String EDIT_STUDENT = " UPDATE `student` " +
            " SET `name` = ?, `point` = ? " +
            " WHERE (`id` = ?); ";

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        // Mở kết nối với DB
        Connection connection = dbConnection.getConnection();
        // Tạo câu lệnh truy vấn động
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double point = resultSet.getDouble("point");
                Student student = new Student(id, name, point);
                students.add(student);
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
        return students;
    }

    @Override
    public void saveStudent(Student student) {
        //Mở kết nối với DB
        Connection connection = dbConnection.getConnection();
        //Tạo câu lệnh query
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT);
            // truyền dữ liệu thông qua dấu ?
            preparedStatement.setString(1, student.getName());
            preparedStatement.setDouble(2, student.getPoint());
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
    public void deleteStudent(int idDelete) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT);
            preparedStatement.setInt(1, idDelete);
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
    public Student getStudentById(int idEdit) {
        Student student = new Student();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENT);
            preparedStatement.setInt(1, idEdit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double point = resultSet.getDouble("point");
                student = new Student(id, name, point);
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
        return student;
    }

    @Override
    public void editStudent(Student student) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT_STUDENT);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setDouble(2, student.getPoint());
            preparedStatement.setInt(3, student.getId());
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
}

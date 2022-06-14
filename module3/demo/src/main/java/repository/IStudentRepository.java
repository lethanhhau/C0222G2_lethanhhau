package repository;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    void deleteStudent(int idDelete);

    Student getStudentById(int idEdit);

    void editStudent(Student student);
}

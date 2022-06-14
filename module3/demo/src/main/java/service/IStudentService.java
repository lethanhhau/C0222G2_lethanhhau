package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    void deleteStudent(int idDelete);

    Student getStudentById(int idEdit);

    void editStudent(Student student);

    List<Student> findByNameAndId(String nameSearch, String idSearch);
}

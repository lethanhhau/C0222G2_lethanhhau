package service.impl;

import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepositoryImpl;
import service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    IStudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    @Override
    public void saveStudent(Student student) {
        //Gọi repo để lưu dữ liệu
        studentRepository.saveStudent(student);
    }

    @Override
    public void deleteStudent(int idDelete) {
        // gọi repo
        studentRepository.deleteStudent(idDelete);
    }

    @Override
    public Student getStudentById(int idEdit) {
        return studentRepository.getStudentById(idEdit);
    }

    @Override
    public void editStudent(Student student) {
        studentRepository.editStudent(student);
    }

    @Override
    public List<Student> findByNameAndId(String nameSearch, String idSearch) {
        return null;
    }
}

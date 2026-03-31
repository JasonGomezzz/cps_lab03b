package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository repository = new StudentRepository();

    public void registerStudent(StudentEntity student) {
        repository.addStudent(student);
    }

    public List<StudentEntity> listStudents() {
        return repository.getAllStudents();
    }
}
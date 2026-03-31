package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<StudentEntity> students = new ArrayList<>();

    public void addStudent(StudentEntity student) {
        students.add(student);
    }

    public List<StudentEntity> getAllStudents() {
        return students;
    }

    // NUEVO
    public StudentEntity findById(int id) {
        for (StudentEntity s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
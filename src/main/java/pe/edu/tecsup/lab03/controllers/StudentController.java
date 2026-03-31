package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public void createStudent(int id, String name, String email) {
        StudentEntity student = new StudentEntity(id, name, email);
        service.registerStudent(student);
    }

    public void showStudents() {
        for (StudentEntity s : service.listStudents()) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getEmail());
        }
    }
}
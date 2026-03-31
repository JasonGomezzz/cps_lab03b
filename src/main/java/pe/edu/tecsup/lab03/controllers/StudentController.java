package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public void createStudent(int id, String name, String email, String career, double average) {
        StudentEntity student = new StudentEntity(id, name, email, career, average);
        service.registerStudent(student);
    }

    public void showStudents() {
        for (StudentEntity s : service.listStudents()) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getCareer() + " - " + s.getAverage());
        }
    }

    // NUEVO
    public void findStudent(int id) {
        StudentEntity s = service.getStudentById(id);
        if (s != null) {
            System.out.println("Encontrado: " + s.getName());
        } else {
            System.out.println("No encontrado");
        }
    }
}
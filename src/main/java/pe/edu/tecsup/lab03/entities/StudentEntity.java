package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private int id;
    private String name;
    private String email;
    private String career;   // NUEVO
    private double average;  // NUEVO

    public StudentEntity() {}

    public StudentEntity(int id, String name, String email, String career, double average) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.career = career;
        this.average = average;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCareer() { return career; }
    public void setCareer(String career) { this.career = career; }

    public double getAverage() { return average; }
    public void setAverage(double average) { this.average = average; }
}
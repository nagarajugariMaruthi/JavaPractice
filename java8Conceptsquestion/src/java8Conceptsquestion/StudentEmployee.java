package java8Conceptsquestion;

public class StudentEmployee {

    private int id;
    private String name;
    private String Department;
    private double salary;

    public StudentEmployee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        Department = department;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public double getsalary() {
        return salary;
    }
}
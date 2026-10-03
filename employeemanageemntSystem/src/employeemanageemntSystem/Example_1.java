package employeemanageemntSystem;

public class Example_1 {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Example_1(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + id +
               "\nName : " + name +
               "\nAge : " + age +
               "\nDepartment : " + department +
               "\nSalary : " + salary;
    }
}
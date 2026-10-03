package collocation;

public class Employees {

    int id;
    String name;
    String Department;
    double Salary;

    Employees(int id, String name, String Department, double Salary) {

        this.id = id;
        this.name = name;
        this.Department = Department;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + Department + " " + Salary;
    }
}
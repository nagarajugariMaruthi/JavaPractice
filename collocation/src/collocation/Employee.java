package collocation;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {

        return Double.compare(this.salary, e.salary);
    }

    @Override
    public String toString() {

        return id + " " + name + " " + salary;
    }
}
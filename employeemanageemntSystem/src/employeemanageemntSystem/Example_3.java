package employeemanageemntSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' +
               ", age=" + age + ", department='" + department + '\'' +
               ", salary=" + salary + '}';
    }
}

public class Example_3 {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added."); 
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Found: " + e);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void updateEmployee(int id, String name, int age, String department, double salary) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(name);
                e.setAge(age);
                e.setDepartment(department);
                e.setSalary(salary);
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Example_3 manager = new Example_3();

        while (true) {
            try {
                System.out.println("\n=============EMPLOYEE MANAGEMENT SYSTEM =======");
                System.out.println("1.Add Employee");
                System.out.println("2.View Employees");
                System.out.println("3.Search Employee");
                System.out.println("4.Update Employee");
                System.out.println("5.Delete Employee");
                System.out.println("6.Exit");
                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age : ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Department : ");
                        String department = sc.nextLine();
                        System.out.print("Enter salary : ");
                        double salary = sc.nextDouble();
                        manager.addEmployee(new Employee(id, name, age, department, salary));
                        break;
                    case 2:
                        manager.viewEmployees();
                        break;
                    case 3:
                        System.out.print("Enter Employee ID : ");
                        manager.searchEmployee(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Enter Employee ID : ");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Name : ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New age : ");
                        int newage = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Department : ");
                        String newDepartment = sc.nextLine();
                        System.out.print("Enter New Salary : ");
                        double newSalary  = sc.nextDouble();
                        manager.updateEmployee(updateId, newName, newage, newDepartment, newSalary);
                        break;
                    case 5:
                        System.out.print("Enter Employee ID : ");
                        manager.deleteEmployee(sc.nextInt());
                        break;
                    case 6:
                        System.out.println("Thank you");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        }
    }
}
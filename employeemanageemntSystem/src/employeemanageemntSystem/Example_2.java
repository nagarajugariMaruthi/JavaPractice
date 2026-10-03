package employeemanageemntSystem;

import java.util.ArrayList;

public class Example_2 {

    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee Added Successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }
        for (Employee employee : employees) {
            System.out.println("----------------------------");
            System.out.println(employee);
        }
    }

    public void searchEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public void updateEmployee(int id, String name, int age, String department, double salary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setAge(age);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee Updated Successfully.");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }
}
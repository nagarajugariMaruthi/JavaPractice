package collocation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployMain {

    public static void main(String[] args) {

        List<Employe> employees = new ArrayList<>();

        // Adding Employees
        employees.add(new Employe(102, "Maruthi", "IT", 500000));
        employees.add(new Employe(103, "Dhanvitha", "HR", 770000));
        employees.add(new Employe(104, "Nagaraju", "IT", 60000));
        employees.add(new Employe(105, "Ravi", "IT", 590000));
        employees.add(new Employe(106, "Kiran", "HR", 780000));
        employees.add(new Employe(107, "Arun", "IT", 66000));
        employees.add(new Employe(108, "Suresh", "IT", 550000));
        employees.add(new Employe(109, "Prakesh", "HR", 740000));
        employees.add(new Employe(111, "Vijaya", "IT", 63000));
        employees.add(new Employe(112, "Maruthi", "IT", 600000));

        // 1. Display Original Employees
        System.out.println("Original Employees:");

        for (Employe employee : employees) {
            System.out.println(employee);
        }

        // 2. Remove Duplicate Employees
        Set<Employe> uniqueEmployees = new LinkedHashSet<>(employees);

        System.out.println("\nAfter Removing Duplicates:");

        for (Employe employee : uniqueEmployees) {
            System.out.println(employee);
        }

        // Convert Set to List
        List<Employe> employeeList = new ArrayList<>(uniqueEmployees);

        // 3. Sort By Salary Descending
        employeeList.sort(new Comparator<Employe>() {

            @Override
            public int compare(Employe e1, Employe e2) {
                return Double.compare(e2.Salary, e1.Salary);
            }
        });

        System.out.println("\nEmployees Sorted By Salary Descending:");

        for (Employe employee : employeeList) {
            System.out.println(employee);
        }

        // 4. Find Highest Paid Employee
        Employe highestPaid = employeeList.get(0);

        System.out.println("\nHighest Paid Employee:");
        System.out.println(highestPaid);

        // 5. Group Employees By Department
        Map<String, List<Employe>> departmentMap = new HashMap<>();

        for (Employe employee : employeeList) {

            if (!departmentMap.containsKey(employee.Department)) {

                departmentMap.put(
                        employee.Department,
                        new ArrayList<>()
                );
            }

            departmentMap.get(employee.Department).add(employee);
        }

        System.out.println("\nEmployees Grouped By Department:");

        for (Map.Entry<String, List<Employe>> entry : departmentMap.entrySet()) {

            System.out.println("\nDepartment: " + entry.getKey());

            for (Employe employee : entry.getValue()) {
                System.out.println(employee);
            }
        }

        // 6. Average Salary Of Each Department
        System.out.println("\nAverage Salary By Department:");

        for (Map.Entry<String, List<Employe>> entry : departmentMap.entrySet()) {

            double totalSalary = 0;

            for (Employe employee : entry.getValue()) {
                totalSalary = totalSalary + employee.Salary;
            }

            double averageSalary =
                    totalSalary / entry.getValue().size();

            System.out.println(
                    entry.getKey() + " = " + averageSalary
            );
        }
    }
}
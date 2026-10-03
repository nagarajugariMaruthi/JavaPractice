package com.java.basic;

import java.util.function.BiFunction;

public class Main_2 {

    public static void main(String[] args) {

        Employee Emp1 = new Employee(102, "Maruthi", 50000);
        Employee Emp2 = new Employee(103, "Dhanvitha", 70000);

        BiFunction<Employee, Employee, Employee> HightSalary =
                (e1, e2) -> e1.EmployeeSalary > e2.EmployeeSalary ? e1 : e2;

        Employee result = HightSalary.apply(Emp1, Emp2);

        System.out.println("Employee with high Salary: " + result.EmployeeName);
        System.out.println("Salary: " + result.EmployeeSalary);
    }
}
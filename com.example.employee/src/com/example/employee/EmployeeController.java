package com.example.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        return new Employee(101, "Maruthi", "IT");
    }
}
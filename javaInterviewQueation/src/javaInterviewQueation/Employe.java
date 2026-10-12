package demoProject;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name = "Maruthi";

    public void displayName() {
        System.out.println("Employee Name: " + name);
    }
}
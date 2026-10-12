package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

class SalesgenderEmployee {

    private int id;
    private String name;
    private String gender;
    private String Department;

    public SalesgenderEmployee(int id, String name, String gender, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.Department = department;
    }

    public String getgender() {
        return gender;
    }

    public String getDepartment() {
        return Department;
    }
}
	public class SalesMangenderEmployee {

    // 10. Count male and female employees in the Sales team.

    public static void main(String[] args) {

        List<SalesgenderEmployee> Employee = Arrays.asList(
            new SalesgenderEmployee(1, "maruthi", "Male", "SalesMan"),
            new SalesgenderEmployee(2, "dhanvitha", "Female", "HR"),
            new SalesgenderEmployee(3, "nagarathna", "Female", "SalesMan"),
            new SalesgenderEmployee(4, "manjula", "Female", "SalesMan"),
            new SalesgenderEmployee(5, "vamshi gowda", "Male", "IT")
        );

        Map<String, Long> result = Employee.stream()
            .filter(e -> e.getDepartment().equalsIgnoreCase("SalesMan"))
            .collect(Collectors.groupingBy(
                SalesgenderEmployee::getgender,
                Collectors.counting()
            ));

        System.out.println(result);
    }
}




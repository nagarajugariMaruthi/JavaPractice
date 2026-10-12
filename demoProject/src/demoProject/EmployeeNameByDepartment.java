
package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeDepartment {

    private int id;
    private String name;
    private String Department;

    EmployeeDepartment(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.Department = department;
    }

    public String getname() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }
}

public class EmployeeNameByDepartment {

    // 12. List down the names of all employees in each department

    public static void main(String[] args) {

        List<EmployeeDepartment> Employee = Arrays.asList(
            new EmployeeDepartment(105, "Maruthi", "IT"),
            new EmployeeDepartment(110, "dhanvitha", "HR"),
            new EmployeeDepartment(115, "vamshi gowda", "Finance"),
            new EmployeeDepartment(120, "sunil gowda", "sales")
        );

        Map<String, List<String>> namesByDepartment =
            Employee.stream()
                .collect(Collectors.groupingBy(
                    EmployeeDepartment::getDepartment,
                    Collectors.mapping(
                        EmployeeDepartment::getname,
                        Collectors.toList()
                    )
                ));

        namesByDepartment.forEach((department, names) ->
            System.out.println(department + " : " + names)
        );
    }
}

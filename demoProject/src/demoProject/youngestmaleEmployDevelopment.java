
package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class YoungestEmployee {

    private int id;
    private String name;
    private String gender;
    private String Department;
    private int age;

    public YoungestEmployee(int id, String name, String gender,
                            String Department, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.Department = Department;
        this.age = age;
    }

    public String getgender() {
        return gender;
    }

    public String getDepartment() {
        return Department;
    }

    public int getage() {
        return age;
    }

    @Override
    public String toString() {
        return "YoungestEmployee [id=" + id + ", name=" + name
                + ", gender=" + gender + ", Department=" + Department
                + ", age=" + age + "]";
    }
}

public class youngestmaleEmployDevelopment {

    // Get the youngest male employee in the Development department

    public static void main(String[] args) {

        List<YoungestEmployee> Employee = Arrays.asList(
            new YoungestEmployee(1, "maruthi", "Male", "IT", 26),
            new YoungestEmployee(2, "dhanvitha", "Female", "HR", 24),
            new YoungestEmployee(3, "nagarathan", "Female", "Marketing head", 28),
            new YoungestEmployee(4, "nagaraju", "Male", "Sales officer", 34),
            new YoungestEmployee(5, "manjula", "Female", "IT", 33),
            new YoungestEmployee(6, "Sunil gowda", "Male", "Marketing head", 26),
            new YoungestEmployee(7, "Rahul", "Male", "Development", 23),
            new YoungestEmployee(8, "Kiran", "Male", "Development", 25)
        );

        Employee.stream()
            .filter(e -> e.getgender().equalsIgnoreCase("Male"))
            .filter(e -> e.getDepartment().equalsIgnoreCase("Development"))
            .min(Comparator.comparingInt(YoungestEmployee::getage))
            .ifPresent(System.out::println);
    }
}
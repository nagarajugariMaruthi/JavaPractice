package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Employefelterr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        List<Employe> employees = Arrays.asList(
            new Employe(101, "Maruthi", "Java", 70000),
            new Employe(102, "Rahul", "Java", 55000),
            new Employe(103, "Anil", "Python", 80000),
            new Employe(104, "Suresh", "Java", 65000)
        );

        Predicate<Employe> javaDepartment =
                emp -> emp.Department.equals("Java");

        Predicate<Employe> salaryCheck =
                emp -> emp.Salary > 60000;

        Predicate<Employe> finalCheck =
                javaDepartment.and(salaryCheck);

        employees.stream()
                 .filter(finalCheck)
                 .forEach(System.out::println);
    }
}
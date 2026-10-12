package demoProject;

import java.util.*;
import java.util.stream.Collectors;

public class coursenamestudent {

    // 20. Build a Map of course names to lists of student names.
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Maruthi", "Java"),
                new Student("Dhanvitha", "Python"),
                new Student("Siddu", "Java"),
                new Student("Sony", "Python"),
                new Student("Vamshi", "SQL")
        );

        Map<String, List<String>> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList()
                        )
                ));

        result.forEach((course, studentNames) ->
                System.out.println(course + " : " + studentNames));
    }
}

class Student {

    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
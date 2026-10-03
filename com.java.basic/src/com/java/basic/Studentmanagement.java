package com.java.basic;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface PassFail {
    void check(Student s);
}

public class Studentmanagement {

    public static void main(String[] args) {

        List<Student> Students = new ArrayList<>();

        // 1. Add Students
        Students.add(new Student(101, "Maruthi", 99));
        Students.add(new Student(102, "Dhanvitha", 100));
        Students.add(new Student(103, "Nagarathan", 55));
        Students.add(new Student(104, "Sashi", 65));

        // 2. Display all students
        System.out.println("-------- ALL STUDENTS ----------");

        Students.forEach(s ->
            System.out.println(s.id + " " + s.name + " " + s.Marks)
        );

        // 3. Students with marks above 60
        System.out.println("\n---------- STUDENT MARKS ABOVE 60 --------");

        Students.forEach(s -> {
            if (s.Marks > 60) {
                System.out.println(s.name + " " + s.Marks);
            }
        });

        // 4. Find highest marks
        System.out.println("\n---------- HIGHEST MARKS --------");

        Student Hight = Students.get(0);

        for (Student s : Students) {
            if (s.Marks > Hight.Marks) {
                Hight = s;
            }
        }

        System.out.println(Hight.name + " - " + Hight.Marks);

        // 5. Sort students by name
        System.out.println("\n--------- SORT STUDENTS BY NAME ------");

        Students.sort((s1, s2) ->
            s1.name.compareTo(s2.name)
        );

        Students.forEach(s ->
            System.out.println(s.name)
        );

        // 6. Check Pass / Fail using Functional Interface
        System.out.println("\n----- PASS / FAIL -----");

        PassFail result = s -> {
            if (s.Marks >= 40) {
                System.out.println(s.name + " - Pass");
            } else {
                System.out.println(s.name + " - Fail");
            }
        };

        Students.forEach(result::check);
    }
}
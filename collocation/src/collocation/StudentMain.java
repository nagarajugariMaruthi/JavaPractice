package collocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> Students = new ArrayList<>();

        Students.add(new Student(105, "Maruthi", 50000));
        Students.add(new Student(110, "Dhanvitha", 80000));
        Students.add(new Student(111, "Nagaraju", 90000));

        // 1. Sort marks by descending order

        Students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student S1, Student S2) {

                return Integer.compare(S2.marks, S1.marks);
            }
        });

        System.out.println("Sort Marks Descending Order:");

        for (Student student : Students) {

            System.out.println(student);
        }

        // 2. Sort name by ascending order

        Students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student S1, Student S2) {

                return S1.name.compareTo(S2.name);
            }
        });

        System.out.println("\nSort By Name Ascending Order:");

        for (Student student : Students) {

            System.out.println(student);
        }

        // 3. Sort ID by ascending order

        Students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student S1, Student S2) {

                return Integer.compare(S1.id, S2.id);
            }
        });

        System.out.println("\nSort By ID Ascending Order:");

        for (Student student : Students) {

            System.out.println(student);
        }
    }
}
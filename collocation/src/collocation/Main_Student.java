package collocation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_Student {

    public static void main(String[] args) {

        List<Student_1> students = new ArrayList<>();

        students.add(new Student_1(1, "Ravi", 75, 22));
        students.add(new Student_1(2, "Kiran", 85, 21));
        students.add(new Student_1(3, "Suresh", 65, 23));
        students.add(new Student_1(4, "Arun", 90, 20));

        // Age descending
        Comparator<Student_1> ageComparator =
                Comparator.comparingInt((Student_1 s) -> s.age)
                          .reversed();

        // Name alphabetically
        Comparator<Student_1> nameComparator =
                Comparator.comparing((Student_1 s) -> s.name);

        students.sort(ageComparator);

        System.out.println("Age Descending:");

        for (Student_1 s : students) {
            System.out.println(s);
        }

        students.sort(nameComparator);

        System.out.println("\nName Alphabetically:");

        for (Student_1 s : students) {
            System.out.println(s);
        }
    }
}
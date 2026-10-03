package collocation;

import java.util.ArrayList;
import java.util.Collections;

public class Main_2 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Ravi", 75));
        list.add(new Student(102, "Kiran", 90));
        list.add(new Student(103, "Arun", 65));

        MarksComparator mc = new MarksComparator();

        Collections.sort(list, mc);

        System.out.println("Students sorted by marks:");

        for (Student s : list) {
            s.display();
        }
    }
}
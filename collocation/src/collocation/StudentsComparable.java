package collocation;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsComparable {

    class Students implements Comparable<Students> {

        int id;
        String name;
        int marks;

        Students(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Students s) {
            return this.name.compareTo(s.name);
        }

        void display() {
            System.out.println(id + " " + name + " " + marks);
        }
    }
}
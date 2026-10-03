package collocation;

import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        StudentsComparable obj = new StudentsComparable();

        ArrayList<StudentsComparable.Students> list = new ArrayList<>();

        list.add(obj.new Students(101, "Ravi", 75));
        list.add(obj.new Students(102, "Kiran", 85));
        list.add(obj.new Students(103, "dhanvitha", 99));

        Collections.sort(list);

        System.out.println("Students Sorted Names:");

        for (StudentsComparable.Students s : list) {
            s.display();
        }
    }
}
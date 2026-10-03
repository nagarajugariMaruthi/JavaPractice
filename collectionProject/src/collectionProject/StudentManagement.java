
package collectionProject;

import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Maruthi", "MPC"));
        students.add(new Student(102, "Dhanvitha", "CEC"));
        students.add(new Student(103, "Nani", "BIPC"));
        students.add(new Student(104, "Sashara", "HEC"));
        students.add(new Student(105, "Sony", "B Tech"));

        // HashSet
        HashSet<String> course = new HashSet<>();

        for (Student s : students) {
            course.add(s.getCourse());
        }

        // HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        for (Student s : students) {
            studentMap.put(s.getid(), s.getName());
        }

        // Queue
        Queue<String> queue = new LinkedList<>();

        queue.add("Maruthi");
        queue.add("Sony");
        queue.add("Dhanvitha");

        // Stack
        Stack<String> deleteStudents = new Stack<>();

        deleteStudents.push("Student 105");
        deleteStudents.push("Student 106");

        // Display Students
        System.out.println("--------- Student ----------");

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display Course
        System.out.println("\n------- Course -------");
        System.out.println(course);

        // Display Student HashMap
        System.out.println("\n----- Student Map -----");
        System.out.println(studentMap);

        // Display Queue
        System.out.println("\n----- Waiting Queue -----");
        System.out.println(queue);

        System.out.println("Next Student: " + queue.peek());

        // Display Stack
        System.out.println("\n------- Deleted Students -------");
        System.out.println(deleteStudents);

        System.out.println("Recently Deleted: " + deleteStudents.peek());

        // Sorting
        Collections.sort(
            students,
            Comparator.comparing(Student::getName)
        );

        System.out.println("\n------- Sorted Students -------");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

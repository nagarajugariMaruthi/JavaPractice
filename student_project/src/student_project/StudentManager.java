package student_project;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully.");
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student s : students) {
            System.out.println("----------------------");
            System.out.println(s);
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(name);
                s.setAge(age);
                s.setCourse(course);

                System.out.println("Student Updated Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {

                students.remove(s);

                System.out.println("Student Deleted Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }
}
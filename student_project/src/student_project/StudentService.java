package student_project;
import java.util.ArrayList;
public class StudentService {

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
	            s.display();
	        }
	    }

	    // Search Student
	    public void searchStudent(int id) {

	        boolean found = false;

	        for (Student s : students) {

	            if (s.getId() == id) {
	                s.display();
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	            System.out.println("Student Not Found.");
	    }

	    // Update Student
	    public void updateStudent(int id, String name, int age, String course) {

	        boolean found = false;

	        for (Student s : students) {

	            if (s.getId() == id) {

	                s.setName(name);
	                s.setAge(age);
	                s.setCourse(course);

	                System.out.println("Student Updated Successfully.");
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	            System.out.println("Student Not Found.");
	    }

	    // Delete Student
	    public void deleteStudent(int id) {

	        Student removeStudent = null;

	        for (Student s : students) {

	            if (s.getId() == id) {
	                removeStudent = s;
	                break;
	            }
	        }

	        if (removeStudent != null) {

	            students.remove(removeStudent);
	            System.out.println("Student Deleted Successfully.");

	        } else {

	            System.out.println("Student Not Found.");
	        }
	    }
	}
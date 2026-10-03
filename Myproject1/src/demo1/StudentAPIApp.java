package demo1;
import java.util.*;

// Main Application
public class StudentAPIApp {
    public static void main(String[] args) {
    }
}

// Student Model
class Student {
    private int id;
    private String name;
    private int marks;

    public Student() {}

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }
}

// Controller
class StudentController {

    private Map<Integer, Student> studentDB = new HashMap<>();

    // Create student

    public String addStudent(@RequestBody Student student) {
        studentDB.put(student.getId(), student);
        return "Student added successfully";
    }

    // Get all stude
    public Collection<Student> getAllStudents() {
        return studentDB.values();
    }

    // Get student by ID
    
    public Student getStudent(@PathVariable int id) {
        return studentDB.get(id);
    }

    // Update student
    
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        if (studentDB.containsKey(id)) {
            studentDB.put(id, student);
            return "Student updated";
        } else {
            return "Student not found";
        }
    }

    // Delete student
    public String deleteStudent(@PathVariable int id) {
        if (studentDB.containsKey(id)) {
            studentDB.remove(id);
            return "Student deleted";
        } else {
            return "Student not found";
        }
    }
        SpringApplication.run(StudentAPIApp.class, args);
    
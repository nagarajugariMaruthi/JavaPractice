package inheritanceProject;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.rollNo = 101;
        s.course = "Java";
        s.name = "Maruthi";
        s.age = 25;

        s.displayStudent();   // Parent class method
        s.display();          // Student class method

        System.out.println("----------------");

        Teacher t = new Teacher();

        t.rollNo = 201;
        t.course = "Python";
        t.employeeId = 5001;
        t.subject = "Core Java";

        t.displayStudent();   // Parent class method
        t.displayTeacher();   // Teacher class method
    }
}
package inheritance.java;

public class Students {

    String StudentName;
    int StudentAge;

    public void DisplayPerson() {
        System.out.println("Student Name : " + StudentName);
        System.out.println("Student Age : " + StudentAge);
    }
}

  class Student extends Students {

    int RollNo;
    String Course;

    void display() {
        System.out.println("Student RollNo : " + RollNo);
        System.out.println("Student Course : " + Course);
    }
}

class StudentMain {

    public static void main(String[] args) {

        Student obj = new Student();

        obj.StudentName = "Maruthi";
        obj.StudentAge = 25;
        obj.RollNo = 101;
        obj.Course = "MCA";

        obj.DisplayPerson();
        obj.display();
    }
}
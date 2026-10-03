package inheritanceProject;

public class Student extends Person3 {

    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
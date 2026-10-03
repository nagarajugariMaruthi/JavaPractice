package com.loops.foreach;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display Method
    void displayStudent() {

        System.out.println("----------------------------");
        System.out.println("Student ID    : " + id);
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
    }
}

public class Project_Demo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks : ");
                    int marks = sc.nextInt();

                    Student s = new Student(id, name, marks);

                    students.add(s);

                    System.out.println("Student Added Successfully");

                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No Students Available");

                    } else {

                        for (Student stu : students) {

                            stu.displayStudent();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID To Search : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student stu : students) {

                        if (stu.id == searchId) {

                            stu.displayStudent();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID To Delete : ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (Student stu : students) {

                        if (stu.id == deleteId) {

                            students.remove(stu);

                            System.out.println("Student Deleted Successfully");

                            deleted = true;

                            break;
                        }
                    }

                    if (!deleted) {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID To Update : ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Student stu : students) {

                        if (stu.id == updateId) {

                            System.out.print("Enter New Marks : ");
                            int newMarks = sc.nextInt();

                            stu.marks = newMarks;

                            System.out.println("Marks Updated Successfully");

                            updated = true;

                            break;
                        }
                    }

                    if (!updated) {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 6:

                    System.out.println("Thank You For Using Application");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
package basic_String_question;

import java.util.Scanner;

public class Example_1 {

    public static void main(String[] args) {

        // Write a program to read and print a student's details.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Age: ");
        int age = sc.nextInt();

        System.out.print("Enter the Marks: ");
        double marks = sc.nextDouble();

        System.out.print("Is the Student Pass (true/false): ");
        boolean isPass = sc.nextBoolean();

        // Output
        System.out.println("\n----- Student Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Marks  : " + marks);
        System.out.println("IsPass : " + isPass);

        sc.close();
    }
}
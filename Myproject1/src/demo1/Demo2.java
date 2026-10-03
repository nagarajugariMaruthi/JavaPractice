package demo1;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        int m1, m2, m3, m4;
        int total;
        double average;

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter marks of 4 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();

        // calculate total and average
        total = m1 + m2 + m3 + m4;
        average = total / 4.0;

        // display
        System.out.println("Total = " + total);
        System.out.printf("Average = %.2f\n", average);

        // grade calculation
        if (average >= 90) {
            System.out.println("Grade = A");
        } else if (average >= 75) {
            System.out.println("Grade = B");
        } else if (average >= 50) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = Fail");
        }

        sc.close();
    }
}
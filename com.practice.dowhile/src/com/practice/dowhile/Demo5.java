package com.practice.dowhile;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {

        // Fibonacci → next = a + b, a = b, b = next
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");

        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

            i++;
        }
    }
}
package com.loops.foreach;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {

        // Sum array → sum = sum + element
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();   // take input
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arry[i];   // core logic
        }

        System.out.println("Sum of elements: " + sum);
    }
}

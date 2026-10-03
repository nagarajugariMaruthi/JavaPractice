package com.practice.dowhile;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        temp = num;

        // Armstrong logic using do-while
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        } while (temp != 0);

        // Check number
        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

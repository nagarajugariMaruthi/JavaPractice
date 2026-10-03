package com.practice.java;

import java.util.Scanner;

public class Demo14 {

    public static void main(String[] args) {

        // check if number ends with digit 5
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 10 == 5) {
            System.out.println("Number ends with 5");
        } else {
            System.out.println("Does not end with 5");
        }

        sc.close();
    }
}
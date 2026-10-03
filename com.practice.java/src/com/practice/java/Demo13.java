package com.practice.java;

import java.util.Scanner;

public class Demo13 {

    public static void main(String[] args) {

        // check if a number lies between 100 and 200
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("Number lies between 100 and 200");
        } else {
            System.out.println("Number does not lie between 100 and 200");
        }

        sc.close();
    }
}
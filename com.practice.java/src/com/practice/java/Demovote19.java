package com.practice.java;

import java.util.Scanner;

public class Demovote19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // correct

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close(); // correct method
    }
}
package com.practice.dowhile;

import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        do {
            System.out.print("Enter first name: ");
            firstName = sc.next();

            System.out.print("Enter last name: ");
            lastName = sc.next();

        } while (firstName.isEmpty() || lastName.isEmpty());

        System.out.println("Full Name: " + firstName + " " + lastName);

        sc.close();
    }
}
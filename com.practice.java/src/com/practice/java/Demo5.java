package com.practice.java;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a is greatest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is greatest: " + b);
        } else {
            System.out.println("c is greatest: " + c);
        }

        sc.close();
    }
}
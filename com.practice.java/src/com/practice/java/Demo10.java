package com.practice.java;

public class Demo10 {

    public static void main(String[] args) {

        int n = -10;

        if (n < 0) {
            n = -n;   // convert negative to positive
        }

        System.out.println("Absolute value is: " + n);
    }
}
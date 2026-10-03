package com.practice.java;

public class Demo16 {

    public static void main(String[] args) {

        // find the maximum of four numbers
        int a = 45, b = 55, c = 65, d = 75;
        int max;

        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        System.out.println("Maximum number is: " + max);
    }
}
package com.java.basic;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExample_1 {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        int result = add.add(10, 20);

        System.out.println("Addition: " + result);
    }
}
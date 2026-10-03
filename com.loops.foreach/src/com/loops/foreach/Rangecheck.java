package com.loops.foreach;
import java.util.Scanner;
public class Rangecheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = sc.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("Number is between 1 and 100");
        } else {
            System.out.println("Number is outside the range");
        }
    }
}

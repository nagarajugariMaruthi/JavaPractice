package com.loops.foreach;
import java.util.Scanner;
public class Names {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number (1-10):");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("maruthi");
        } else if (n == 2) {
            System.out.println("sony");
        } else if (n == 3) {
            System.out.println("sashi");
        } else if (n == 4) {
            System.out.println("nani");
        } else if (n == 5) {
            System.out.println("ammu");
        } else if (n == 6) {
            System.out.println("Em nagaraju");
        } else if (n == 7) {
            System.out.println("Manjula");
        } else if (n == 8) {
            System.out.println("vannur swamy");
        } else if (n == 9) {
            System.out.println("Manjula");
        } else if (n == 10) {
            System.out.println("marakka");
        } else {
            System.out.println("Invalid input");
        }
    }
}
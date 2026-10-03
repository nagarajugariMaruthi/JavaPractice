package com.loops.foreach;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {

        // Even/Odd → if(element % 2 == 0) even++ else odd++
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arry = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }

        int even = 0, odd = 0;

        // for-each loop
        for (int element : arry) {
            if (element % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
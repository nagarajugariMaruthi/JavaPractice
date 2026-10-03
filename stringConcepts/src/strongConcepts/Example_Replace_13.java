package strongConcepts;

import java.util.Scanner;

public class Example_Replace_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String result = str.replaceAll("\\s+", "");

        System.out.println("Without spaces: " + result);

        sc.close();
    }
}
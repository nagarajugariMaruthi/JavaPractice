package come_recursive_basics;

import java.util.Scanner;

public class StringSentance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {

            String original = word.toLowerCase();
            String reverse = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }

            if (original.equals(reverse)) {
                count++;
            }
        }

        System.out.println("Number of palindrome words = " + count);

        sc.close();
    }
}
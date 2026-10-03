package strongConcepts;

import java.util.Scanner;

public class Example_Permutation {

    // Recursive method to generate permutations
    public static void permute(String str, String ans) {

        // Base case
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Recursive case
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Remove the current character
            String rest = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permute(rest, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Permutations are:");
        permute(str, "");

        sc.close();
    }
}
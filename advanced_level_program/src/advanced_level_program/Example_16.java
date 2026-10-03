package advanced_level_program;

import java.util.Scanner;

public class Example_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the Second String:");
        String str2 = sc.nextLine().toLowerCase();

        System.out.print("Common characters: ");

        boolean[] printed = new boolean[26];

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                for (int j = 0; j < str2.length(); j++) {

                    if (ch == str2.charAt(j) && !printed[ch - 'a']) {
                        System.out.print(ch + " ");
                        printed[ch - 'a'] = true;
                        break;
                    }
                }
            }
        }

        sc.close();
    }
}
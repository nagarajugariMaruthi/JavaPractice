package strongConcepts;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicate_word_Sentance {

    public static void main(String[] args) {

    	
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String[] words = sc.nextLine().split("\\s+");

        LinkedHashSet<String> unique = new LinkedHashSet<>(Arrays.asList(words));

        System.out.printf("After removing duplicate words: %s%n",
                String.join(" ", unique));

        sc.close();
    }
}
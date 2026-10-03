package arry_imp_question;

public class Example_28 {

    public static void main(String[] args) {

        // Find the Maximum Consecutive 1's in an Array

        int[] arr = {1, 0, 0, 1, 1, 1, 1, 0, 1};

        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                count++;

                if (count > maxcount) {
                    maxcount = count;
                }

            } else {

                count = 0;
            }
        }

        // Print only once
        System.out.println("Maximum Consecutive 1's = " + maxcount);
    }
}
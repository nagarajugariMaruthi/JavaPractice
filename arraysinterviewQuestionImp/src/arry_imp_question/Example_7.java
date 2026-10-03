package arry_imp_question;

public class Example_7 {

    public static void main(String[] args) {

        // Count Even and Odd Elements in an Array

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};

        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        System.out.println("\nEven Numbers Count = " + evenNumber);
        System.out.println("\nOdd Numbers Count = " + oddNumber);
    }
}
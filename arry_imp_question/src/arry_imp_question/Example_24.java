package arry_imp_question;

public class Example_24 {

    public static void main(String[] args) {

        // Rotate an Array to the Right by K Positions

        int[] arr = {10, 20, 30, 40, 50};

        int k = 2;

        // Rotate k times
        for (int j = 0; j < k; j++) {

            // Store last element
            int temp = arr[arr.length - 1];

            // Shift elements to the right
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            // Place last element at first position
            arr[0] = temp;
        }

        System.out.println("Array After Right Rotation:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
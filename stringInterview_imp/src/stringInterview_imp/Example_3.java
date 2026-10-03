package stringInterview_imp;

public class Example_3 {

    public static void main(String[] args) {

        String name = "apple";

        char[] arr = name.toCharArray();

        System.out.println("Print the duplicate characters:");

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            if (arr[i] == ' ') {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = ' '; // Mark duplicate
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}
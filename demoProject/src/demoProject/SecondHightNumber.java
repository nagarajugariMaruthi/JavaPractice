
package demoProject;

public class SecondHightNumber {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int First = Integer.MIN_VALUE;
        int SecondHightNumber = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > First) {
                SecondHightNumber = First;
                First = num;

            } else if (num > SecondHightNumber && num < First) {
                SecondHightNumber = num;
            }
        }

        if (SecondHightNumber == Integer.MIN_VALUE) {
            System.out.println("Second-highest number does not exist");
        } else {
            System.out.println("Second-highest number: " + SecondHightNumber);
        }
    }
}

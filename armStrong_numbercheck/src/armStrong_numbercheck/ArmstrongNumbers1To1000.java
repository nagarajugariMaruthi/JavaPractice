package armStrong_numbercheck;

public class ArmstrongNumbers1To1000 {

    public static void main(String[] args) {

        for (int number = 1; number <= 1000; number++) {

            int temp = number;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }

            if (number == sum) {
                System.out.println(number);
            }
        }
    }
}
package fresher_coding_practice;

public class Example_3 {

    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (temp == sum) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Is Not Armstrong");
        }
    }
}
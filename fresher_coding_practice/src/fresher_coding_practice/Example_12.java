package fresher_coding_practice;

public class Example_12 {

    public static void main(String[] args) {

        int num = 7;
        boolean isprime = true;

        if (num <= 1) {
            isprime = false;

        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        if (isprime) {
            System.out.println("is prime " + num);
        } else {
            System.out.println("is not prime " + num);
        }
    }
}
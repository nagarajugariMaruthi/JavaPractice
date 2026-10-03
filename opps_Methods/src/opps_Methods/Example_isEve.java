package opps_Methods;

public class Example_isEve {

    // Method to check Prime Number
    public void Example_isprime(int num) {

        int count = 0;

        if (num <= 1) {
            System.out.println(num + " is Not Prime");
            return;
        }

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }

    public static void main(String[] args) {

        Example_isEve obj = new Example_isEve();

        obj.Example_isprime(7);
        obj.Example_isprime(13);
        obj.Example_isprime(10);
        obj.Example_isprime(1);
    }
}
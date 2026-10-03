package AssigmentOperators;

public class ArithamaticOperators {

    public static void main(String[] args) {

        int a = 20;

        // Arithmetic operations
        a = a + 20;   // 40
        a = a - 10;   // 30
        a = a * 15;   // 450
        a = a % 5;    // 0
        a = a / 10;   // 0

        System.out.println("Arithmetic result: " + a);

        // Assignment operators
        int b = 20;

        b += 10;  // 30
        b -= 5;   // 25
        b *= 5;   // 125
        b %= 2;   // 1
        b /= 4;   // 0

        System.out.println("Assignment result: " + b);
    }
}
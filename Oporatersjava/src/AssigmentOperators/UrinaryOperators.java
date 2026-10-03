package AssigmentOperators;

public class UrinaryOperators {

    public static void main(String[] args) {

        int a = 10;

        int b = +a;   // Unary plus
        int b1 = -a;  // Unary minus

        int d = ++a;  // pre-increment (a = 11, d = 11)
        int c = --a;  // pre-decrement (a = 10, c = 10)

        int f = --a;  // pre-decrement (a = 9, f = 9)
        int g = a--;  // post-decrement (g = 9, then a = 8)

        boolean flag = true;
        boolean hp = !flag;  // logical NOT

        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("hp = " + hp);
    }
}
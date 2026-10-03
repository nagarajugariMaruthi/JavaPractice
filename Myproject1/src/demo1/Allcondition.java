package demo1;

public class Allcondition {

    public static void main(String[] args) {

        // 1. if condition
        int a = 10;
        if (a > 5) {
            System.out.println(a);
        }

        // 2. if-else
        int b = 3;
        if (b > 3) {
            System.out.println("greater than");
        } else {
            System.out.println("smaller than");
        }

        // 3. else-if ladder
        int c = 10;
        if (c > 10) {
            System.out.println("greater than 10");
        } else if (c == 10) {
            System.out.println("Equal to 10");
        } else {
            System.out.println("smaller than 10");
        }

        // 4. nested if
        int d = 8;
        if (d > 8) {
            if (d % 2 == 0) {
                System.out.println("even number");
            }
        }

        // 5. switch statement
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 6. ternary operator
        int a1 = 7;
        String maruthi = (a1 > 5) ? "greater" : "smaller";
        System.out.println(maruthi);
    }
}

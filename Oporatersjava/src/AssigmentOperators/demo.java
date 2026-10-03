package AssigmentOperators;

public class demo {

	public static void main(String[] args) {
				int a = 10, b = 5;
				        // 1. Arithmetic Operators
				        System.out.println("Arithmetic Operators:");
				        System.out.println("a + b = " + (a + b));
				        System.out.println("a - b = " + (a - b));
				        System.out.println("a * b = " + (a * b));
				        System.out.println("a / b = " + (a / b));
				        System.out.println("a % b = " + (a % b));

				        // 2. Relational Operators
				        System.out.println("\nRelational Operators:");
				        System.out.println("a > b = " + (a > b));
				        System.out.println("a < b = " + (a < b));
				        System.out.println("a == b = " + (a == b));
				        System.out.println("a != b = " + (a != b));

				        // 3. Logical Operators
				        System.out.println("\nLogical Operators:");
				        System.out.println("(a > 5 && b < 10) = " + (a > 5 && b < 10));
				        System.out.println("(a > 5 || b > 10) = " + (a > 5 || b > 10));
				        System.out.println("!(a > b) = " + !(a > b));

				        // 4. Assignment Operators
				        int x = 20;
				        System.out.println("\nAssignment Operators:");
				        x += 5;  // x = x + 5
				        System.out.println("x += 5 -> " + x);
				        x -= 3;
				        System.out.println("x -= 3 -> " + x);
				        x *= 2;
				        System.out.println("x *= 2 -> " + x);
				        x /= 2;
				        System.out.println("x /= 2 -> " + x);

				        // 5. Unary Operators
				        int y = 10;
				        System.out.println("\nUnary Operators:");
				        System.out.println("++y = " + (++y));
				        System.out.println("y++ = " + (y++));
				        System.out.println("After y++ = " + y);
				        System.out.println("--y = " + (--y));

				        // 6. Bitwise Operators
				        int p = 6, q = 3;
				        System.out.println("\nBitwise Operators:");
				        System.out.println("p & q = " + (p & q));
				        System.out.println("p | q = " + (p | q));
				        System.out.println("p ^ q = " + (p ^ q));
				        System.out.println("~p = " + (~p));

				        // 7. Shift Operators
				        System.out.println("\nShift Operators:");
				        System.out.println("p << 1 = " + (p << 1));
				        System.out.println("p >> 1 = " + (p >> 1));

				        // 8. Ternary Operator
				        System.out.println("\nTernary Operator:");
				        String result = (a > b) ? "a is greater" : "b is greater";
				        System.out.println(result);

				        // 9.  Operator 
				        System.out.println("\ninstanceof Operator:");
				        String str = "Hello";
				        System.out.println("str instanceof String = " + (str instanceof String));
				    }
	}



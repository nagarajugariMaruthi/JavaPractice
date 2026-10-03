package constructor_Practice;

public class Calculator {

 void addtion(int a , int b) {
	 System.out.println("Addtion : " + (a + b));
	 
 }
 
 
   void subtract(int a, int b) {
	   System.out.println("subtraction : " + (a - b));
   }
   
   void multiply(int a, int b) {
	   System.out.println("multiplay : " + (a * b));
	   
   }
   
   void divide(int a, int b) {
	   System.out.println("divide : " + ( a / b));
   }

public static void main(String[] args) {
	
	Calculator c1 = new Calculator();
	
	c1.addtion(30, 20);
	c1.subtract(10, 30);
	c1.multiply(50, 20);
	c1.divide(12, 12);
}
}
	

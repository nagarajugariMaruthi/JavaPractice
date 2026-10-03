package constructor_Practice;

public class Recktangale {

 int length = 10;
 int width = 5;
 
 void findArea() {
	 
	
	int Area = length * width;

			 System.out.println("Find the leangth : " + length);
	         System.out.println("Find the width : " + width);
	         System.out.println("Find the Area : " + Area);
	         
 }
 
 public static void main(String[] args) {
	 
	 Recktangale r1 = new Recktangale();
	 
	 r1.findArea();
 }
}
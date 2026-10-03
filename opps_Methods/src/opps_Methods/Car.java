package opps_Methods;

public class Car {
 
	String Brand;
	double Model;
	long price;
	
Car() {
	
	Brand = "Bmw";
	Model = 2000;
	price = 5000000;
}
 Car(String Brand) {
	 
   this.Brand = "honda";
   this.Model = 2024;
   this.price = 200000;
 }
 
 void printdate() {
	 
	 System.out.println("Brand : " + Brand);
	 System.out.println("Modela : " + Model);
	 System.out.println("Price  : " + price);
	 
	 System.out.println("-----------------------");
 }
 
 public static void main(String[] args) {
	 
	 Car Car1 = new Car();
	 
	 Car car2 = new Car("Hond");
	 
	 Car car3 = new Car("Bmw");
	 
	 Car car4 =  new Car("shift");
	 
	 Car1.printdate();
	 car2.printdate();
 }
}
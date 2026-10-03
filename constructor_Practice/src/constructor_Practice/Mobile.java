package constructor_Practice;

public class Mobile {

  String Company;
  String Color;
  int Storage;
  

Mobile(String Company, String Color, int Storage) {
	
	this.Company = Company;
	this.Color = Color;
	this.Storage = Storage;
	
}

 Mobile(Mobile obg) {
	 
	 this.Company = obg.Company;
	 this.Color = obg.Color;
	 this.Storage = obg.Storage;
	 
 }
 
 void display() {
	 
	 System.out.println("Company Name : " + Company);
	 System.out.println("Color : " + Color);
	 System.out.println("Storage : " + Storage);
	 System.out.println("------------------------------");
 }
 
 public static void main(String[] args) {
	 
	 Mobile Mobile = new Mobile("Iphone" , "Block", 128);
	 
	 Mobile Mobile2 = new Mobile(Mobile);
	 
	 
	 System.out.println("Original Mobile ");
	 Mobile2.display();
	 
	 System.out.println("Copy Object ");
	 Mobile2.display();
	 
	 
	 Mobile.Color = "blue";
	 
	 System.out.println("After the changing copy Abject : ");
	 
	 System.out.println("Original Mobile");
	 Mobile.display();
	 
	 System.out.println("Copy Object");
	 Mobile.display();
 }
}
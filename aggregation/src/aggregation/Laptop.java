package aggregation;

public class Laptop {
  
	String Brand;
	String Model;
	
	 Laptop(String Brand , String Model) {
		 
		 this.Brand = Brand;
		 this.Model = Model;
	 }

   void displayLaptop() {
	   
     System.out.println("Brand Name : " + Brand);
     System.out.println("Laptop Name : " + Model);
   }
}
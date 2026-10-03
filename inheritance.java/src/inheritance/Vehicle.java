package inheritance;

public class Vehicle {

  String BrandName;
  double Price;
  public int model;
  public String fuelType;
  
  public void displayVehicle() {
	  
	  System.out.println("Brand NAme : " + BrandName);
	  System.out.println("Price : " + Price);
  }
}


public class Car extends Vehicle   { 
	
	int model;
	String fuelType;
 
	void DisplayCar() {
		
		System.out.println("Model Name : " + model);
		System.out.println("Fueltype   : " + fuelType);
	}
}

  class VehicleMain  {
	  
	  public static void main(String[] args) {
		  
		  Car obj = new Car();
		  
		  obj.BrandName = "BMW";
		  obj.Price = 5000000;
		  obj.model = 2026;
		  obj.fuelType = "petrol";
		  
		  obj.displayVehicle(); 
		  obj.displayVehicle();
	  }
  }

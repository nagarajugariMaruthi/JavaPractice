package inheritanceProject;

public class Car {

  String Brand;
  int model;
  double price;
  
  Car(String Brand, int model, double price) {
	  
	  this.Brand = Brand;
	  this.model = model;
	  this.price = price;
  }
  
@Override 

public String toString() {
	return "Brand[Brand=" + Brand +
			",model=" + model +
			",price=" + price + "]";
}
}

	
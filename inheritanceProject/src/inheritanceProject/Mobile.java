package inheritanceProject;

public class Mobile {

  String brand;
  String Storage;
  double Ram;
  
  Mobile(String brand, String Storage, double Ram) {
	  
	  this.brand = brand;
	  this.Storage = Storage;
	  this.Ram = Ram;
  }

  @Override 
  public String toString() {
	  return "brand[brand" + brand+
			  ",Storage " + Storage +
			  ",Ram " + Ram + "]";
  }
}
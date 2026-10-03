package inheritanceProject;

public class Laptop {
	
	String Brand;
	String Proccessar;
	double Price;
	
	Laptop(String Brand, String Proccessar, double Price) {
		
		this.Brand = Brand;
		this.Proccessar = Proccessar;
		this.Price = Price;
	}


    @Override 
    	  public int hashCode() {
    	 return (int) (Brand.hashCode() + Proccessar.hashCode() + Price);
    }
}
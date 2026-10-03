package construcoter_referance;

import java.util.function.BiFunction;

class Product {
	
	int Productid;
	String ProductName;
	// 7. Create Product object using BiFunction.
	Product(int Productid, String ProductName) {
		this.Productid = Productid;
		this.ProductName = ProductName;
		
	}
		 void display() {
			 System.out.println("Product Id = " + Productid);
			 System.out.println("Product Name = " + ProductName);
		 }
}
		
public class Example_8 {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, String, Product> bf = Product::new;
		
		Product Product = bf.apply(105, "HP LAPTOP");
		
	 Product.display();
	}
}

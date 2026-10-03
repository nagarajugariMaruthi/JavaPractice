package collocation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> Products = new ArrayList<>();
		
		Products.add(new Product(1, "Laptop", 500000 ,4.5));
		Products.add(new Product(2, " Mobile ", 20000, 4.2));
		Products.add(new Product(3, " Tablet ", 10000, 4.7));
		
		System.out.println("Sort By Price Acending order");
		
		Products.sort(null);
		
		for(Product p : Products) {
			System.out.println(p);
		}
		
	System.out.println("\n Sort by rating decending order ");
	
	 Products.sort(
			 Comparator.comparingDouble((Product p) -> p.rating)
			       .reversed()
	);
	 
	 for(Product p : Products) {
		 System.out.println(p);
	 }
	 
	 System.out.println("\n Sort Name alphabetically");
	 
	 Products.sort(
			 Comparator.comparing((Product p) -> p.name)
	);
	 
	 for(Product p : Products) {
		 System.out.println(p);
	 }
}
}
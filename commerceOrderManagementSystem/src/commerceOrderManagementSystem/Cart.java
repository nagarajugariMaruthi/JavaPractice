package commerceOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Product> Products = new ArrayList<>();
	
	public void ProductCart(Product Product) {
		
		Products.add(Product);
		
		System.out.println(
		 Product.ProductName() +
		 "Product Name add Sucussfully "
		
		 );
	}
	
	public void removeProduct(int Productid) {
		
		boolean removed = Products.removeIf(
				
			Product -> Product.ProductId() == Productid
			
			);
		
		if(removed) {
			System.out.println("Product removed from cart ");
		} else {
			System.out.println("Product not founf in cart ");
		}
	}
			
 public void displayCart() {
	  
	 if(Products.isEmpty()) {
		 
		 System.out.println("Cart isEmpty");
		 return;
	 }
	 
	 System.out.println("\n------CART------");
	 
	 double total = 0;
 
	 for (Product Product : Products) {
		 
		 System.out.println(Products);
		 
		 total = total = Product.ProductPrice();
		 
	 }
	 
	 System.out.println("total Amount : " + total);
	 
 }
 
  public double Caluculatetototal() {
	  
	  double total = 0;
	  
	  for(Product Product : Products) {
		  
		  total += Product.ProductPrice();
		  
	  }
	  
	  return total;
  }
  
  public List<Product> getProducts() {
      return Products;
  }

  public void clearCart() {
      Products.clear();
  }
}
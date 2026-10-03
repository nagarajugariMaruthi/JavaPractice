package commerceOrderManagementSystem;

public class Product {

 private int Productid;
 private String ProductName;
 private double Price;
 private int quntiety;
 
  public Product(int Producatid, String productName, double Price, int quntiety) {
	  
	  this.Productid = Productid;
	  this.ProductName = ProductName;
	  this.Price = Price;
	  this.quntiety = quntiety;
  }
  
  public int ProductId() {
	  return Productid;
  }
  
  public String ProductName() {
	  return ProductName;
  }
  
  public double ProductPrice() {
	  return Price;
  }
  
  public int quntiety() {
	  return quntiety;
  }
  
  @Override
  
  public  String toString() {
	  return "ProductId " + Productid +
			  " ProductName " + ProductName +
			  "Productprice " + Price +
			  " Productquntiety " + quntiety;
  }
}
			 
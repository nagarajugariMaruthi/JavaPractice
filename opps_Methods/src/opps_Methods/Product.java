package opps_Methods;

public class Product {

 String ProDucteName;
 double productPrice;
 
 void takeinput(String l_ProductName, double l_ProductPrice) {
	 
	  ProDucteName = l_ProductName;
	  productPrice = l_ProductPrice;
 }
 
 void printdate() {
	 
	 System.out.println(" ProductName : " + ProDucteName);
	 System.out.println("  ProductPrice : "  + productPrice);
 }
 
 public static void main(String[] args) {
	 
	 Product Emp1 = new Product();
	 Emp1.takeinput("Mobile iphone" , 77777);
	 Emp1.printdate();
 }
}

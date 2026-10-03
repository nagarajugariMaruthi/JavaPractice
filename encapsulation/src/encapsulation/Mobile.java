package encapsulation;

public class Mobile {

 private String iphone;
 private double price;
 
  public void setiphone(String iphone) {
	  
	  this.iphone = iphone;
  }
  
  public void setprice(double price) {
	  
	  this.price = price;
  }
  
  public String setiphone() {
	return iphone;
  }
  
  public double setprice() {
	  return price;
  }
  
  public static void main(String[] args) {
	  
	  Mobile obj = new Mobile();
	  
	  obj.setiphone("iphone");
	  obj.setprice(100000);
	  
	  System.out.println("iphone : " + obj.iphone);
	  System.out.println("price : " + obj.price);
	  
  }
}
	  
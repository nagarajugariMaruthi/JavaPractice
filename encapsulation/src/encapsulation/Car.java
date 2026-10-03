package encapsulation;

public class Car {

 private String BMW;
 private static int X5;
 
 public void setbmw(String BMW) {
	 
	 this.BMW = BMW;
 }
 
 public void setX5(int X5) {
	 
	 this.X5 = X5;
	 
 }
 
  public String setbmw() {
	  
	  return setbmw();
  }
  
  public int setX5() {
	  
	  return setX5();
  }
  
  public static void main(String[] args) {
	  
	  Car obj = new Car();
	  
	  obj.setbmw("BMW");
	  obj.setX5(X5);
	  
	  System.out.println("CAR BMW : " + obj.BMW);
	  System.out.println("Modela X5 : " + obj.X5);
	  
  }
}
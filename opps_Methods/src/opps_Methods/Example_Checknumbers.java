package opps_Methods;

public class Example_Checknumbers {

	public void Example_checknumbers(int num) {
		
		// 5. Check Positive, Negative, or Zero

//Create a method `checkNumber(int num)` that prints whether the number is **Positive**, **Negative**, or **Zero**.
		
		if(num > 0) {
			System.out.println(num  + " is positive ");
		} else if(num < 0) {
			System.out.println(num + " is Negative ");
		} else {
			System.out.println(num + " is Zero ");
		}
	}
	
  public static void main(String[] args) {
	  
	  Example_Checknumbers obj = new Example_Checknumbers();
	  
	  obj.Example_checknumbers(25);
	  obj.Example_checknumbers(-10);
	  obj.Example_checknumbers(0);
  }
}
  

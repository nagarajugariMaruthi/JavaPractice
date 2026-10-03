package opps_Methods;

import java.util.jar.Attributes.Name;

public class Example_Reverse {

   public void Example_Reverse(int num) {
	   
	   
	   int reverse = 0;
	   int temp = num;
	   
	   while(num != 0) {
		   
		   int rem = num  % 10;
		   
		   reverse = reverse  *10 + rem;
		   
		   num = num / 10;
	   }
		   
	  
   System.out.println("Reverse of temp " + temp + " = " + reverse);

   Example_Reverse obj = new Example_Reverse();

   obj.Example_Reverse(12345);
   obj.Example_Reverse(180773);
   obj.Example_Reverse(2288);
}
}
   
   
   
   
   
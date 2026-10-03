package opps_Methods;

public class Example_isPrime {

	//  7. Check Prime Number

   //Create a method `isPrime(int num)` that prints whether the number is **Prime** or **Not Prime**.
 
	public void Example_isprime(int num) {
		
		int count  = 0;
		
		if(num <= 1) {
			System.out.println(num + "is not prime ");
			return;
		}

		 for(int i = 1; i <=num; i++) {
			 
			 if(num % i == 0) {
				 count++;
			 }
		 }
			  if(count == 2) {
				  System.out.println(num + " is prime");
			  } else {
				  System.out.println(num + " is not prime");
			  }
	}
	
	public static void main(String[] args) {
		
		Example_isEve obj = new Example_isEve();
	
	  obj.Example_isprime(7);
	  obj.Example_isprime(13);
	  obj.Example_isprime(10);
	  obj.Example_isprime(1);
	}
}
		 

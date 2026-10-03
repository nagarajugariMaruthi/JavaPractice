package arrya_basic.practice;

public class Average_of_ArrayDemo5 {

	 public static void main(String[] args) {
		 
		 
		 // array declaration 
		 int[] arr = {10,20,30,40,50};
		 
		 // variables store 
		  int sum = 0;
		  
		  // find the variables store
		  for(int i = 0; i < arr.length; i++) {
			  
			  sum = sum + arr[i];
		  }
		  // caluculate avarage 
		  
		 double avarage = (double) sum / arr.length;
		 
		 //print avarage 
		 System.out.println("Avarage print array Elements is: "+ avarage);
	 }
}

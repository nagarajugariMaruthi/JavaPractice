package arry_imp_question;

public class Example_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Find All Triplets Whose Sum is Equal to a Given Number
  int[] arr = {10,20,30,40,50,60};
  
  int sum = 100;
  
  for (int i = 0; i < arr.length -1; i++) {
	  
	  for (int j = i+1; j < arr.length; j++) {
		
      for (int k = j +1; k < arr.length; k++) {
    	 
      if(arr[i] + arr[j] + arr[k] == sum) {
    	  
    	  System.out.println(arr[i] + "+" +arr[j] +"+" +arr[k]+ "=" +sum);
      }
}
	  }
  }
	}
}
package arry_imp_question;

public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int[] arr = {10,20,30,40,50};
  
  int key = 30;
  boolean found  = false;
  
  for (int i = 0; i < arr.length; i++) {
    
	  if(arr[i] == key) {
		    found = true;
		  System.out.println("Elements found = " +i);
		  break;
	  }
  }
	  if(found == true) {
		  System.out.println("Elements is not found");
	  }
	  }
	}
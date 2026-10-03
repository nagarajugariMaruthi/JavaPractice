package arrya_basic.practice;

public class Find_Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[] = {10,20,5,30,40,50};
    int smallest = arr[0];
  for(int i = 1; i<arr.length; i++) {
	  if(arr[i] < smallest) {
		  smallest = arr[i];
	  }
	  
	  System.out.println("Enter the smallest number: = "+ smallest);
	  }
  }
}
package arrya_basic.practice;

public class SearchElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int[] arr = {10,20,30,40,50};
	 
	 int target = 30;
	 boolean found = false;
	 
	 for (int i = 0;  i <= arr.length; i++) {
		 if (arr[i] == target) {
			 System.out.println("Elements found index " + i);
			 found = true;
			 break;
		 }
	 }
	 if(!found) {
	 System.out.println("not Elements found");
		 }
	}
}
package demo1;

class javautil {


	public class secondLaegest {
	    private Object integer;

		public static void main(String[] args) {
	        
	     Scanner sc = new Scanner(System.in);
	        
	        // input size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n];
	        
	        // input elements
	        System.out.println("Enter elements: ");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int largest = integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        
	        for(int i = 0; i < n; i++) {
	            if(arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if(arr[i] > secondLargest && arr[i] ! = largest) {
	                secondLargest = arr[i];
	            }
	        }
	        
	        // output
	        if(secondLargest == integer.MAN_VALUE) {
	            System.out.println("No second largest");
	        } else {
	            System.out.println("second Largest = "+ secondLargest);
	        }
	        sc.close();
	    }
	}
}

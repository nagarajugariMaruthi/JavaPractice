package opps_Methods;

public class Example_FindLargest {

// Create a method `findLargest(int a, int b)` that prints the larger number.

    public void Example_FindLargest(int a, int b) {
    	
    	if(a > b) {
    		System.out.println("Largest " + a);
    	} else if( b > a) {
    		System.out.println("Largest " + b);
    	} else {
    		System.out.println("Botha are Equals ");
    	}
    }
    
    public static void main(String[] args) {
    	
    	Example_FindLargest obj = new Example_FindLargest();
    	
    	obj.Example_FindLargest(10,20);
    	obj.Example_FindLargest(50,30);
    	obj.Example_FindLargest(24,24);
    }
}
package string.java.preactice;

public class MethodOverLoading_Demo12 {
	    
	    //Method with 2 parameters 
	    void add(int a, int b) {
	        
	        System.out.println("Sum : " +(a+b));
	    }
	    
	    // Method with 3 parameters
	    void add(int a, int b, int c) {
	        
	        System.out.println("Sum : " +(a+b+c));
	    }
	    
	    public static void main(String[] args) {
	        
	      MethodOverLoading obj = new MethodOverLoading();
	        
	        obj.add(10,20);
	        obj.add(10,20,30);
	    }
	}

package come_recursive_basics;

public class Static_method_Demo3 {
	    
	    private static Static_method_Demo3 staticmethod;


		static void display() {
	        System.out.println("this is a static method");
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        // calling static method using class name
	        staticmethod.display();
	    }
	    }


package come_recursive_basics;

public class Cally_by_value_Demo2 { 
	    static void changeValue(int num) {
	        num = num + 10;
	        System.out.println("Inside method: " + num);
	    }
	    
	    public static void main(String[] args) {
	        int number = 20; 
	        
	        System.out.println("Before method call: " + number);
	        
	        changeValue(number);
	        
	        System.out.println("After method call: " + number);
	    }
	}


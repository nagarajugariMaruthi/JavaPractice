package string.java.preactice;

public class StringBufferExample_Demo6 {
	    public static void main(String[] args) {
	        
	        StringBuffer sb = new StringBuffer("Hello");
	        
	        // append
	        sb.append(" world");
	        
	        // insert
	        sb.insert(5,",");
	        
	        //replace
	        sb.replace(0,5,"hi");
	        
	        // delete
	        sb.delete(2,3);
	        
	        // reverse
	        sb.reverse();
	        
	        System.out.println("Result : " + sb);
	    }
	}

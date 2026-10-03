package armStrong_numbercheck;

public class Exmple_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "madam";
    String rev = "";
    
    for (int i = str.length() -1; i>=0;  i--) {
		
    	rev += str.charAt(i);
    }
    if(str.equals(rev)) {
    System.out.println("is the palindrom");
    } else {
    	System.out.println("is not palindrom");
    }
	}
}
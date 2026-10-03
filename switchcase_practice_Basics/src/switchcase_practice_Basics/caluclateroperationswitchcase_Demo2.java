package switchcase_practice_Basics;

public class caluclateroperationswitchcase_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 50;
    int b = 67;
    int choice = 3;
    
    
    switch(choice) {
    case 1:
    	System.out.println("Addition = " + (a+b));
    	break;
    case 2:
    	System.out.println("Subtraction = " + (a-b));
    	break;
    case 3:
    	System.out.println("multiplexen = " + (a * b));
    	break;
    case 4:
    	System.out.println("division = " + (a / b));
    	break;
    	default:
    		System.out.println("invalid");
    }
	}
}
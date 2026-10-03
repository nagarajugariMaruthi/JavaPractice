package conditionifstatement;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int day = 7;
     switch (day) {
     case 1:
    	 System.out.println("sunday\t");
    	 break;
     case 2:
    	 System.out.println("monday\t");
    	 break;
     case 3:
    	 System.out.println("tusday\t");
    	 break;
     case 4:
    	 System.out.println("wednesday\t");
    	 break;
     case 5:
    	 System.out.println("thursday\t");
    	 break;
     case 6:
    	 System.out.println("friday\t");
    	 break;
     case 7:
    	 System.out.println("saturday\t");
    	 break;
    	 default:
    	 System.out.println("invalid day\t");
     }
	}
}

package arrya_basic.practice;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {11,12,13,14,16,80,90,};
    
     int addEvennumber = 0;
     int countoddnumber = 0;
     
     for (int i : arr) {
    	 
    	  if (i % 2 == 0) {   
    		  addEvennumber = addEvennumber + i;
    	 }
     
    	 else {
    		 countoddnumber++;
    	 }
    	  System.out.println("addevenumber : " + addEvennumber);
    	  System.out.println("countoddnumber : " + countoddnumber);
    	  
    	 }
	}
}
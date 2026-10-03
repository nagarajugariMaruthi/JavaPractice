package basic_String_question;


public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	 
		String name = "madam";
		
		int vowelscount = 0;
		int  consanatecount = 0;
	
		
		char[] x = name.toCharArray();
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i] >= 'a' && x[i] <= 'z' || x[i] >= 'A' && x[i] <= 'Z') {
				
       if(x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u' ||
    		   x[i] == 'A' || x[i] == 'E' || x[i] == 'I' ||x[i] == 'O' || x[i] == 'U') {
       
    	   vowelscount++;
			} 
			else {
				 consanatecount++;
			
			}
			}
		}
		System.out.println("vowelscount: " + vowelscount);
		System.out.println("consanatecount: " +  consanatecount);
			}
		}

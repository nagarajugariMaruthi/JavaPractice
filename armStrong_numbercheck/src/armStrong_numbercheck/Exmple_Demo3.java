package armStrong_numbercheck;

public class Exmple_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Hello world";
     int count = 0;
     
     str = str.toLowerCase();
     
     for (int i = 0; i < str.length(); i++) {
		
    	 char ch = str.charAt(i);
    	 
    	 if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    	 count++;
     }
     System.out.println("Number of vowels " + count);
	}
}
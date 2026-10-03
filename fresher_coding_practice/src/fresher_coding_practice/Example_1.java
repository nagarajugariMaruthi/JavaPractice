package fresher_coding_practice;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated  method stub
    
		String str = "java";
		String rev = " ";
		
		for (int i = str.length() -1; i >=0; i--) {
			
			rev +=str.charAt(i);
		}
		
		System.out.println("Reversed Array = " + rev);
	}
}

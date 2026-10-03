package lamda_EXPRESSIONS;

@FunctionalInterface 
   interface Convert {
	
	String ConvertString(String str);
}

public class Example_8 {
	
	// 8. Convert String to uppercase.
	public static void main(String[] args) {
		
		Convert obj = str -> str.toUpperCase();
		
		String result = obj.ConvertString("java");
		
		System.out.println("touppercase = " + result);
	}

}

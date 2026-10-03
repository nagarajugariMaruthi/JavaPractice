package method_Basic_Practice;

public class split_String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String sentance = "Java is to leanrn Programming";
	 
	
	 String[] word  = sentance.split(" ");
	 
	 
	 String Result =String.join("-", word);
	 
	 System.out.println("Orginal Sentance = " + sentance);
	 System.out.println("String joined Sentance = " + Result);
	}
}

	 
	 

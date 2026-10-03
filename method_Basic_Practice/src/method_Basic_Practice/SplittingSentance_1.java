package method_Basic_Practice;

public class SplittingSentance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String sentance  = "Java is the powerfull langauge ";
	 
	 
	 String[] word = sentance.split(" ");
	 
	 
	 for (String word1 : word) {
		 System.out.println(word1);
	 }
	}
}
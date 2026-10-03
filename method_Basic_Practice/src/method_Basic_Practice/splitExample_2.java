package method_Basic_Practice;

public class splitExample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   String sentance = "Well come to java full stake course";
   
      String[] word = sentance.split(" ");
      
      int count = word.length;
      
      
      System.out.println("Sentance = " + sentance);
      System.out.println("Noumber of word  = " + count);
	}
}
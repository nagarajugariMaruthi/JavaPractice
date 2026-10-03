package armStrong_numbercheck;

public class Exmple_Dem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str = "EM maruth";
  int count = 0;
  
  str = str.toLowerCase();
  
  for (int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
  
  if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
  count++;
}
	System.out.println("count the vowels = " + count);
}
}
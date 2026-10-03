package strongConcepts;

public class Example_duplicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "apple";
		
		char[] ch = name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			boolean  isduplicate = true;
			
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[i] == ch[j]) {
					{
						isduplicate= false;
						break;
					}
				}
				
				if(isduplicate) {
					System.out.println(ch[i]);
				}
			}
		}
}
}
package string.java.preactice;

public class CharacterFrequency_Demo8 {
	    public static void main(String[] args) {

	        String str = "programming";

	        char[] ch = str.toCharArray();

	        for (int i = 0; i < ch.length; i++) {

	            int count = 1;

	            // Skip already counted characters
	            if (ch[i] == ' ') {
	                continue;
	            }

	            for (int j = i + 1; j < ch.length; j++) {

	                if (ch[i] == ch[j]) {
	                    count++;

	                    // Mark counted character
	                    ch[j] = ' ';
	                }
	            }

	            System.out.println(ch[i] + " = " + count);
	        }
	    }
	}

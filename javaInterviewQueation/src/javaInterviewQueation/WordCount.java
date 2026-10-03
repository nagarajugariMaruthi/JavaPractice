package javaInterviewQueation;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 12. Word Count
		
		String Str = "Java is Power Full Programming Language";
		
		String[] words = Str.trim().split("\s+");
		
		System.out.println("12. Word Count = " + words.length);
	}

}

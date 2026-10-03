package java8InterviewQuetion;

@FunctionalInterface 
interface  Mylamda {
	
	void show();
}

public class LambdaExpressions {
	// 4. Lambda Expressions
	
	public static void main(String[] args) {
		
		Mylamda obj = () -> System.out.println("Hello Maruthi");
		
		obj.show();
	}

}

package java8InterviewQuetion;

@FunctionalInterface
interface Myinterface {
	
	void show();
}

public class FunctionalInterface_1 {
	
	// 1. Functional Interface
	
	public static void main(String[] args) {
		
		Myinterface obj = () -> System.out.println("Hello Maruthi");
		
		obj.show();
	}

}

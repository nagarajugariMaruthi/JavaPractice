package java8InterviewQuetion;

@FunctionalInterface
 
 interface myinterface {
	
	void show();
}
public class Static_Method_Reference_5 {
	// 5. Static Method Reference
	
	static void display() {
		
		System.out.println("Hello maruthi");
	}
	public static void main(String[] args) {
		
		Myinterface obj = Static_Method_Reference_5::display;
		
		obj.show();
	}
}
		
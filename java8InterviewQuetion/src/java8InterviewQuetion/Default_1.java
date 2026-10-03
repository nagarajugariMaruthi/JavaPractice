package java8InterviewQuetion;
 
interface vehicle {
	
	default void start() {
		System.out.println("vehicle is starting methods ");
	}
	
}

public class Default_1 {
	// Default
	
	public static void main(String[] args) {
		
		vehicle obj = new vehicle() {
			
		};
			
			obj.start();
		}
	}

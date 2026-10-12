package lamda_EXPRESSIONS;


import java.util.function.Consumer;

public class InstanceMethodReference {

void show(String name) {
	 System.out.println("Hello = " + name);
}

	
	public static void main(String[] args) {
		
		// public class InstanceMethodReference 
		
		InstanceMethodReference obj = new InstanceMethodReference();
		
		Consumer<String> c = obj::show;
		
		c.accept("Maruthi");
		
		
	}

}

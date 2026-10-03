package opps_Methods;

public class Example_printable {

 
	public void Example_printable(int num) {
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(num + " x "+ i+ " = " +(num * i));
		}
	}
	
	public static void main(String[] args) {
		
		
		Example_printable obj = new Example_printable();
		
		obj.Example_printable(19);
	}
}
package opps_Methods;

public class AddExample_1 {
 
	
	public int add(int a, int b) {
		
		return  a+b;
	}
	
	public static void main(String[] args) {
		
		AddExample_1 obj = new AddExample_1();
		
		int result = obj.add(10,20);
		
		System.out.println("sum:" + result);
	}
}
		
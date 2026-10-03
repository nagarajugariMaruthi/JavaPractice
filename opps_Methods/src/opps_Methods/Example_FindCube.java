package opps_Methods;

public  class Example_FindCube {

	public  void Example_FindCube(int num) {
	
	int Cube = num* num* num;
	
	System.out.println("Cube" + Cube);
	
	}
	
	public static void main(String[] args) {
		
		Example_FindCube obj = new Example_FindCube ();
		
		obj.Example_FindCube(3);
		obj.Example_FindCube (12);
		obj.Example_FindCube(5);
	}
}
	
	
	
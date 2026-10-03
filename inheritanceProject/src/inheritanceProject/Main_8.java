package inheritanceProject;

public class Main_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetStudent M = new GetStudent(111, "Maruthi");
		
		System.out.println(" class name " + M.getClass().getName());
		
		System.out.println("simple class name " + M.getClass().getName());
		
		System.out.println("package  name : " + M.getClass().getPackageName());
	}

}

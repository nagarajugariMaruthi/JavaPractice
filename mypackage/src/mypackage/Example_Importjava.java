package mypackage;

 import java.util.ArrayList;
import java.util.Iterator;

public class Example_Importjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Students = new 	ArrayList<>();
		
		
		Students.add("Maruthi");
		Students.add("Dhanvitha");
		Students.add("Eswer");
		
	 System.out.println("Students Names : ");
	 
	 for(String name : Students) {
		 
		 System.out.println(name);
	 }
	}
}
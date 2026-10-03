package method_Basic_Practice;

public class Formating_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String name = "Maruthi";
	  int age = 26;
	  double salaray = 59999;
	  
	  String result = String.format("Name : %s%nAge : %d%nsalary : %.2f",name,age,salaray);
	  
	  System.out.printf(result);
	}
}
package switchcase_practice_Basics;

import java.util.Scanner; 

public class Student_Grad {
	//1. A Grade
	//2. B Grade
	//3. C Grade
	//4. D Grade
	//5. Fail

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========GRAD MENU=======");
		System.out.println("1.Grad A");
		System.out.println("2.Grad B");
		System.out.println("2.Grad C");
		System.out.println("3.Grad C");
		System.out.println("4.grad D");
		
		
		System.out.println("Enter the choice ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Grad A = Excelant Grad");
			break;
			
		case 2:
			System.out.println("Grad B = Good");
			break;
			
		case 3:
			System.out.println("Grad C = Avarage Student");
			break;
			
		case 4:
			System.out.println("Grad D = Batter Avarage Student");
			break;
			
		case 5:
			System.out.println("Grad D = Fail");
			break;
			
			default:
				System.out.println("Invalid Grad");
		}
		sc.close();
	}
}
				
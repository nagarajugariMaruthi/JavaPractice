package java_imp_Question_practice25;
import java.util.Scanner;
public class Find_the_Grad_StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		
		if(marks >= 90 && marks <=100) {
			System.out.println("Grade A");
		} else if(marks >=80) {
			System.out.println("Grade B");
		} else if(marks >=70) {
			System.out.println("Grade C");
		} else if(marks >=60) {
			System.out.println("Grade E");
		} else if(marks >=50) {
			System.out.println("fail");
		} else {
			System.out.println("Invalid grad");
		}
	}
}
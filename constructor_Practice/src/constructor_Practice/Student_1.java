package constructor_Practice;

public class Student_1 {
 
		
		String name = "Maruthi";
		int age = 26;
		
		void display() {
			
			System.out.println("Student Name : " + name);
			System.out.println("Student age : " + age);
			System.out.println("------------------");
		}
			
			public static void main1 (String[] args) {
				
				Student_1 s1 = new Student_1();
				
				s1.name = "maruthi";
				s1.age = 26;
				
				s1.display();
			}
		}
			
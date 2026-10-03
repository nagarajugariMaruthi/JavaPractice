package java8Conceptsquestion;

import java.util.function.Supplier;

public class Employees {
		
		private int id;
		private String name;
		private double salary;
		
		public Employees() {
			
			id = 0;
			name = "unknow";
			salary = 0.0;
		}
		
		public void display() {
			
			System.out.println("id =" + id);
			System.out.println("name = " + name);
			System.out.println("salary = " + salary);
			
		}
		}
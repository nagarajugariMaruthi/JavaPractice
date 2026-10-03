package come_recursive_basics;
		
		class Student {

		    // Data Members (Variables)
		    int id;
		    String name;

		    // Method
		    void display() {
		        System.out.println("ID: " + id);
		        System.out.println("Name: " + name);
		    }
		}

		public class ClassObjectDemo {

		    public static void main(String[] args) {

		        // Creating Object 1
		        Student s1 = new Student();
		        s1.id = 101;
		        s1.name = "Maruthi";

		        // Creating Object 2
		        Student s2 = new Student();
		        s2.id = 102;
		        s2.name = "Ravi";

		        // Calling Method
		        s1.display();
		        System.out.println();

		        s2.display();
		    }
		}

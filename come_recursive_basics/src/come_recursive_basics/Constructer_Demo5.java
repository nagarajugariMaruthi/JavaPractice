package come_recursive_basics;
	class Constructer_Demo5 {
	    String name; 
	    int age; 
	    
	    void Student(String n, int a) {
	        name = n;
	        age = a;
	    }
	    
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("age: " + age);
	    }
	
	    public static void main(String[] args) {
	    	
	        Student s = new Student();
	        s.display();
	    }
	}


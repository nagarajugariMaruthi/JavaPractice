package inheritanceProject;

	interface MyInterface {

	    // Abstract method
	    void display();

	    // Default method
	    default void message() {
	        System.out.println("This is the default method");
	    }

	    // Static method
	    static void show() {
	        System.out.println("This is the static method");
	    }
	}

	public class Example {

	    // 4. Create an interface containing:
	    // - Abstract method
	    // - Default method
	    // - Static method

	    public static void main(String[] args) {

	        MyInterface m = new MyInterface() {

	            @Override
	            public void display() {
	                System.out.println("This is the abstract method");
	            }
	        };

	        // Calling abstract method
	        m.display();

	        // Calling default method
	        m.message();

	        // Calling static method
	        MyInterface.show();
	    }
	}



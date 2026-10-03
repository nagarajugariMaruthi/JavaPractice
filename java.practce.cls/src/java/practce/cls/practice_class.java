package java.practce.cls;

public class practice_class {
	public class Book {
	    
	    int id;
	    String name;
	    String author;
	    
	    public Book(int id, String name, String auther) {
	        this.id = id;
	        this.name = name;
	        this.author = author;
	    }
	    
	    public void display() {
	        System.out.println("Book ID: " + id);
	        System.out.println("Book Name: " + name);
	        System.out.println("Book author: " + author);
	        System.out.println("-------------------");
	    }

		public int getIssuedQty() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setIssuedQty(int i) {
			// TODO Auto-generated method stub
			
		}
	    }
}
package collectionProject;

public class Student {
	
	private int id;
	private String Name;
	private String Course;
	
	public Student(int id, String Name, String Course) {
		
		this.id = id;
		this.Name = Name;
		this.Course = Course;
		
	}
	
	public int getid() {
		return id;
		
	}
	
	public String getName() {
		return Name;
	}
	
	public String getCourse() {
		return Course;
	}
	
	   @Override
	   public String toString() {
		   
		   return "ID: " + id + ", Name: " + Name + ", Course: " + Course;
	   }
}


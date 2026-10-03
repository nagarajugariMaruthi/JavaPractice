package inheritanceProject;

public class Student_1 {

 String name;
 int id;
 String course;
 
 void toString(String name, int id, String course) {
	  
	  this.name = name;
	  this.id = id;
	  this.course = course;
  }
  
 
  @Override
  public String toString() {
	  return "Student [" + id +
	  		 ", name " + name + 
	  	     ",course " + course + "]";
  }
}
package aggregation;

public class Person {

 String Name;
 String Mobile;
 
  Person(String Name, String Mobile) {
	  
	  this.Name = Name;
	  this.Mobile = Mobile;
  }
  
  void Persondisplay() {
	  
	  System.out.println("Person name : " + Name);
	  System.out.println("Person mobile : " + Mobile);
  }
}
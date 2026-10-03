package collocation;

public class StudentClass {

  int id;
  String name;
  double Marks;
  
  
   public StudentClass(int id, String name, double Marks) {
	   
	   this.id = id;
	   this.name = name;
	   this.Marks = Marks;
   }
   
   
   @Override
   public String toString() {
	   return id + " " + name + " " + Marks;
   }
}
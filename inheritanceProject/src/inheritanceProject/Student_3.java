package inheritanceProject;

public class Student_3 {
	int id;
String name;
  
   Student_3( int id, String name) {
	   this.id  = id;
	   this.name = name;
	  
   }

   @Override
  
	   public boolean equals(Object obj) {
	   
	   Student_3 s =(Student_3) obj;
	   

       if (this.id == s.id && this.name.equals(s.name)) {
           return true;
       } else {
           return false;
       }
   }
}
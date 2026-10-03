package inheritanceProject;

public class Mobile_1 {

   String brand;
   String Model;
   
   Mobile_1(String brand, String Model) {
	   
	   this.brand = brand;
	   this.Model = Model;
   }
  
   @Override 
   
   public boolean equals(Object obj) {
	   
    Mobile_1  M  = (Mobile_1) obj;
	   
	   if(this.brand.equals(M.brand) && this.Model.equals(M.Model)) {
		   return true;
	   } else {
		   return false;
	   }
   }
}
package encapsulation;

public class Student {

  private String Studentname;
  private  int StudentrollNo;
   
 
   public void SetName(String name) {
	   this.Studentname = name;
	   
   }
   
   public void SetrollNo(int rollNo) {
	   this.StudentrollNo = rollNo;
	   
   }
   
   public String getname() {
	   return Studentname;
   }
   
   public int getrollNo() {
	   return StudentrollNo;
   }
   
   public static void main(String[] args) {
	   
	   Student obj = new Student();
	   
	   obj.SetName("Maruthi");
	   obj.SetrollNo(101);
	   
	  
	   System.out.println("Student Name : " + obj.getname());
       System.out.println("Roll Number  : " + obj.getrollNo());
       
   }
}
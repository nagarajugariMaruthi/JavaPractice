package encapsulation;

public class Getter_Student {

  private  String StudentName;
  private int StudentNo;
   
   public void SetName(String Name) {
	   
	   this.StudentName = Name;
	   
   }
   
   public void SetNo(int No) {
	   
	   this.StudentNo = No;
	   
   }
   
    public String SetName() {
    	return SetName();
    }
    
    public int SetNo() {
    	return SetNo();
    }
    
    public static void main(String[] args) {
    	
    	Getter_Student obj = new Getter_Student();
    	
    	obj.SetName("NagarajuGari Maruthi");
    	obj.SetNo(180773);
    	
    	System.out.println("Student Name : " + obj.StudentName);
    	System.out.println("Student No : " + obj.StudentNo);
    	
}
}
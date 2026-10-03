package commerceOrderManagementSystem;

public class User {

	private int userId;
	private String name;
	private String EmailId;
	private String Password;
	
	public User(int userId, String name, String EmailId, String Password) {
		
		this.userId = userId;
		this.name = name;
		this.EmailId = EmailId;
		this.Password = Password;
		
	}
	
  public int getUserId(){
	  return userId;
  }
  
  public String Username() {
	  return name;
	  
  }
  
  public String userEmailId() {
	  return EmailId;
  }
  
  public String userPassword() {
	  return Password;
  }
  
  
  @Override
  
  public String toString() {
	    return "user id " + userId + 
	    	   " name " + name +
	    	   "EmailId " + EmailId +
	    	   " password " + Password;
  }
}
	    	   

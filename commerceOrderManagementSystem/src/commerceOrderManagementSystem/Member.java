package commerceOrderManagementSystem;

public class Member {
	
	private int MemberId;
	private String Name;
	
	public Member(int MemberId , String Name) {
		this.MemberId = MemberId;
		this.Name = Name;
	}

  public int MemberId() {
	  return MemberId;
  }
  
  public String Name() {
	  return Name;
  }
  
	 @Override
	 
	 public String toString() {
		 return "MemberId" + MemberId +
				" Name " + Name;
	 }

	  @Override
public int hashCode() {
	return MemberId;
	  }
	  
	  @Override
	  
	  public boolean equals(Object obj) {
		  
		  if(this == obj) {
			  return true;
		  }
		  
		  if(obj instanceof Member) {
			  Member Member = (Member) obj;
			  
			  return this.MemberId == this.MemberId;
		  }
		  
		  return false;
	  }
}
			  
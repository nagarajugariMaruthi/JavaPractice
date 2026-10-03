package collocation;

import java.util.Objects;

public class Employe {
	
	
	int id;
	String Name;
	String Department;
	double Salary;
	
	
	Employe(int id, String Name, String Department, double Salary) {
		
		this.id = id;
		this.Name = Name;
		this.Department = Department;
		this.Salary = Salary;
	}

	@Override
	
	public String toString() {
		return id + " " + Name + " " + Department + " " + Salary;
	}

	  @Override
	  
	  public boolean equals(Object obj) {
		  
		  if(this == obj) {
			  return true;
			  
		  }
			  
			  if (!(obj instanceof Employe))
		            return false;
			  
				  
				  Employe e = (Employe) obj;
				  
				  

			        return id == e.id;
			    }
	  

			    @Override
			    public int hashCode() {
			        return Objects.hash(id);
			    }
			}
package lamda_EXPRESSIONS;

public class Emplyee {
	
	private int id;
	private String name;
	private String departmanet;
	private double salary;
	
	public Emplyee(int id, String name, String departmanet, double salary) {
		this.id = id;
		this.name = name;
		this.departmanet = departmanet;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public String getdepartmanet() {
		return departmanet;
	}
	
	public double getsalary() {
		return salary;
	}
	
    @Override
    public String toString() {
    	
    	 return id + " " + name + " " + departmanet + " " + salary;
    }
}

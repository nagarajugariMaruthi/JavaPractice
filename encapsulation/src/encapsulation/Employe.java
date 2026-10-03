package encapsulation;

public class Employe {

    private int Employee;
    private double Salary;

    // Setter for Employee ID
    public void SetEmployee(int EmployeeId) {
        this.Employee = EmployeeId;
    }

    // Setter for Salary
    public void SetEmployee(double Salary) {
        this.Salary = Salary;
    }

    // Getter for Employee ID
    public int GetEmployee() {
        return Employee;
    }

    // Getter for Salary
    public double GetSalary() {
        return Salary;
    }

    public static void main(String[] args) {

        Employe obj = new Employe();

        obj.SetEmployee(1001);
        obj.SetEmployee(50000.0);

        System.out.println("Employee ID : " + obj.GetEmployee());
        System.out.println("Employee Salary : " + obj.GetSalary());
    }
}
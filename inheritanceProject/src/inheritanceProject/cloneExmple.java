package inheritanceProject;

public class cloneExmple implements Cloneable {

    int Employeeid;
    String Employeename;
    double Employeesalary;

    cloneExmple(int Employeeid, String Employeename, double Employeesalary) {

        this.Employeeid = Employeeid;
        this.Employeename = Employeename;
        this.Employeesalary = Employeesalary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + Employeeid
                + ", employeeName=" + Employeename
                + ", salary=" + Employeesalary + "]";
    }
}
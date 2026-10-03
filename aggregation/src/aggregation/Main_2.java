package aggregation;

public class Main_2 {
    public static void main(String[] args) {
        // Create Address object first
        Address address = new Address("Bangalore", "Karnataka");
        
        // Create Student object with name and Address object
        Student student = new Student("Raju", address);
        
        // Display student details
        student.displayStudent();
        
        // Or display address separately
        address.displayAddress();
    }
}
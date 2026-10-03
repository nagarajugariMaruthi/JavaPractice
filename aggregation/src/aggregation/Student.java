package aggregation;

public class Student {
    String name;
    Address address;  // Should be Address object, not String
    
    Student(String name, Address address) {
        this.name = name;
        this.address = address;  // Store Address object
    }
    
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: ");
        address.displayAddress();  // Call Address class method
    }
}
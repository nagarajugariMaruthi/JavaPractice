package aggregation;

public class Address {
    String city;      // Convention: use lowercase for variable names
    String state;
    
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    
    void displayAddress() {
        System.out.println("City Name: " + city);
        System.out.println("State Name: " + state);
    }
}
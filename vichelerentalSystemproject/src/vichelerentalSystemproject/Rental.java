package vichelerentalSystemproject;

public class Rental {

    private int rentalId;
    private Vehicle_rental_system vehicle;
    private Customer customer;
    private int numberOfDays;
    private double totalAmount;

    public Rental(int rentalId,
                  Vehicle_rental_system vehicle,
                  Customer customer,
                  int numberOfDays) {

        this.rentalId = rentalId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.numberOfDays = numberOfDays;

        this.totalAmount = vehicle.getRentPerDay() * numberOfDays;
    }

    public int getRentalId() {
        return rentalId;
    }

    public Vehicle_rental_system getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void displayRental() {

        System.out.println("========== Rental Details ==========");

        System.out.println("Rental ID     : " + rentalId);
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Vehicle Name  : " + vehicle.getVehicleName());
        System.out.println("Days          : " + numberOfDays);
        System.out.println("Total Amount  : " + totalAmount);

        System.out.println("====================================");
    }
}
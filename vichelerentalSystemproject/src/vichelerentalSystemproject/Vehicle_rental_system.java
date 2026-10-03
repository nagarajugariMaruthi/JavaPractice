package vichelerentalSystemproject;

public class Vehicle_rental_system {

    private int vehicleId;
    private String vehicleName;
    private String vehicleType;
    private String brand;
    private double rentPerDay;
    private boolean available;

    // Constructor
    public Vehicle_rental_system(int vehicleId, String vehicleName,
            String vehicleType, String brand, double rentPerDay) {

        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayVehicle() {

        System.out.println("----------------------------");
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Brand        : " + brand);
        System.out.println("Rent Per Day : " + rentPerDay);
        System.out.println("Available    : " + (available ? "Yes" : "No"));
        System.out.println("----------------------------");
    }
}
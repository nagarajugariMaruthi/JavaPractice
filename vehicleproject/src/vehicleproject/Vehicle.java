package vehicleproject;

public class Example_Main {
    public static void main(String[] args) {
        // Example usage to make it a runnable program
        Vehicle v = new Vehicle(1, "Toyota", "Camry", 50.0, true);
        v.displayVehicle();
    }
}

class Vehicle {
    private int vehicleId;
    private String brand;
    private String model;
    private double rentPerDay;
    private boolean available;

    public Vehicle() {}

    public Vehicle(int vehicleId, String brand, String model, double rentPerDay, boolean available) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.available = available;
    }

    public void displayVehicle() {
        System.out.println("--------------------------------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Rent/Day   : " + rentPerDay);
        System.out.println("Available  : " + (available ? "Yes" : "No"));
    }
}
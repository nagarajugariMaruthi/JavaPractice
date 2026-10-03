package vichelerentalSystemproject;

import java.util.ArrayList;

public class VehicleManager {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Add Vehicle
    public void addVehicle(Vehicle.Vehicle) {

        vehicles.add(vehicle);

        System.out.println("Vehicle Added Successfully.");
    }

    // View All Vehicles
    public void viewVehicles() {

        if (vehicles.isEmpty()) {

            System.out.println("No Vehicles Available.");
            return;
        }

        for (Vehicle v : vehicles) {

            v.displayVehicle();
        }
    }

    // Search Vehicle
    public Vehicle searchVehicle(int id) {

        for (Vehicle v : vehicles) {

            if (v.getVehicleId() == id) {
                return v;
            }
        }

        return null;
    }

    // Delete Vehicle
    public void deleteVehicle(int id) {

        Vehicle v = searchVehicle(id);

        if (v != null) {

      vehicles.remove(v);

            System.out.println("Vehicle Deleted Successfully.");
        } else {

            System.out.println("Vehicle Not Found.");
        }
    }
}
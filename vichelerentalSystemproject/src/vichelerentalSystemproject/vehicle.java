package vichelerentalSystemproject;

import java.util.ArrayList;

public class vehicle {

	  ArrayList<vehicle> vehicles = new ArrayList<>();

	    // Add Vehicle
	  public void addVehicle(Vehicle.Vehicles) {

	        vehicles.add(vehicle);

	        System.out.println("Vehicle Added Successfully.");
	    }

	    // View All Vehicles
	    public void viewVehicles() {

	        if (vehicles.isEmpty()) {

	            System.out.println("No Vehicles Available.");
	            return;
	        }

	        for (vehicle v : vehicles) {

	            addVehicle();
	        }
	    }

	    // Search Vehicle
	    public vehicle searchVehicle(int id) {

	        for (vehicle v : vehicles) {

	            if (v.getVehicleId() == id) {
	                return v;
	            }
	        }

	        return null;
	    }

	    private int getVehicleId() {
			// TODO Auto-generated method stub
			return 0;
		}

		// Delete Vehicle
	    public void deleteVehicle(int id) {

	        vehicle v = searchVehicle(id);

	        if (v != null) {

	      vehicles.remove(v);

	            System.out.println("Vehicle Deleted Successfully.");
	        } else {

	            System.out.println("Vehicle Not Found.");
	        }
	    }

		public boolean isAvailable() {
			// TODO Auto-generated method stub
			return false;
		}
	}


import java.util.ArrayList;

import vichelerentalSystemproject.vehicle;

public class RentalManager {
    
    ArrayList<Rental> rentals = new ArrayList<>();
    
    public void rentVehicle(vehicle vehicle, Customer customer,int rentalId,int days) {

if(!vehicle.isAvailable()) {
    
    System.out.println("Vehilce Already Rented.");
    return;
}

vehicle.setAvailable(false);


Rental rental =
new Rental(rentalId, vehicle, customer, days);

rentals.add(rental);

System.out.println("Vehicle Rented Successfully.");

System.out.println("Total amount : " + rental.getTotalAmount());
}

public void returnVehicle(Vehicle vehicle) {
    
    vehicle.setAvailable(true);
    
    System.out.println("Vehicle Returned successfully.");
}

public void viewRentals() {
    
    for(Rental r : rentals) {
        r.displayRental();
    }
}
}
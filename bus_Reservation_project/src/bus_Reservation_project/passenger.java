package bus_Reservation_project;

public class passenger {
	public class Booking<Bus> {
	    private passenger passenger;
	    private Bus bus;
	    
	    public Booking(passenger Passenger, Bus bus) {
	        this.passenger = passenger;
	        this.bus = bus;
	    }
	    
	    public passenger getpassenger() {
	        return passenger;
	    }
	    
	    public Bus getBus() {
	        return bus;
	    }
	    
	    public void displayBooking() {
	        System.out.println("Passenger Name: " + passenger.getName());
	        System.out.println("age: " + passenger.getName());
	        System.out.println("Bus Number: " + passenger.getBusNo());
	        System.out.println("--------------------------------");
	    }
	    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBusNo() {
		// TODO Auto-generated method stub
		return null;
	}
}
package bus_Reservation_project;

public class Booking_Demo3<Bus> {

    private passenger passenger;
    private Bus bus;

    public Booking_Demo3(passenger passenger, Bus bus) {
        this.passenger = passenger;
        this.bus = bus;
    }

    public passenger getPassenger() {
        return passenger;
    }

    public Bus getBus() {
        return bus;
    }

    public void displayBooking() {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Age: " + passenger.getName());
        System.out.println("Bus Number: " + ((bus_Reservation_project.passenger) bus).getBusNo());
        System.out.println("--------------------------------");
    }
}
package mypackage;

public class Main_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Rental R;

	        // Car
	        R = new Car();
	        R.displaydetails();
	        R.caluculateRent(3);

	        System.out.println();

	        // Bike
	        R = new Bike();
	        R.displaydetails();
	        R.caluculateRent(5);

	        System.out.println();

	        // Truck
	        R = new Truck();
	        R.displaydetails();
	        R.caluculateRent(10);
}
}
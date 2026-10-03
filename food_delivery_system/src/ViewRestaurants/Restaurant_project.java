package ViewRestaurants;
import java.util.ArrayList;
import java.util.Scanner;

	public class Restaurant_project {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        RestaurantManager manager = new RestaurantManager();

	        while (true) {

	            System.out.println("\n========== FOOD DELIVERY SYSTEM ==========");
	            System.out.println("1. Add Restaurant");
	            System.out.println("2. View Restaurants");
	            System.out.println("3. Exit");
	            System.out.print("Enter Choice : ");

	            int choice = sc.nextInt();

	            switch (choice) {

	            case 1:

	                System.out.print("Enter Restaurant ID : ");
	                int id = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Restaurant Name : ");
	                String name = sc.nextLine();

	                System.out.print("Enter Restaurant Location : ");
	                String location = sc.nextLine();

	                Restaurant restaurant = new Restaurant(id, name, location);
	                manager.addRestaurant(restaurant);

	                break;

	            case 2:

	                manager.viewRestaurants();

	                break;

	            case 3:

	                System.out.println("Thank You!");
	                sc.close();
	                return;

	            default:

	                System.out.println("Invalid Choice!");
	            }
	        }
	    }
	
	// ================= Restaurant Class =================

	public class restaurants{

	    int restaurantId;
	    String restaurantName;
	    String location;

	    public restaurants(int restaurantId, String restaurantName, String location) {

	        this.restaurantId = restaurantId;
	        this.restaurantName = restaurantName;
	        this.location = location;
	    }

	    @Override
	    public String toString() {

	        return "Restaurant ID      : " + restaurantId
	                + "\nRestaurant Name    : " + restaurantName
	                + "\nLocation           : " + location;
	    }
	}
	
	// ================= RestaurantManager Class =================

	class Restaurantmanager {

	    ArrayList<Restaurant> restaurants = new ArrayList<>();

	    // Add Restaurant
	    public void addRestaurant(Restaurant restaurant) {

	        restaurants.add(restaurant);

	        System.out.println("Restaurant Added Successfully.");
	    }

	    // View Restaurants
	    public void viewRestaurants() {

	        if (restaurants.isEmpty()) {

	            System.out.println("No Restaurants Available.");
	            return;
	        }

	        System.out.println("\n===== Restaurant List =====");

	        for (Restaurant r : restaurants) {

	            System.out.println("------------------------------");
	            System.out.println(r);
	        }
	    }

	}
}
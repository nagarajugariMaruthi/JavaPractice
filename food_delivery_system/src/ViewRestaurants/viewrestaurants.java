package ViewRestaurants;
import java.util.ArrayList;
public class viewrestaurants {
	    
	    ArrayList<Restaurant> restaurants = new ArrayList<>();
	    
	    // Add Restaurant
	    public void addRestaurant(Restaurant restaurant) {
	        restaurants.add(restaurant);
	        System.out.println("Restaurant Added successfully.");
	    }
	    
	    // view Restaurants
	    public void viewRestaurant() {
	        
	        if(restaurants.isEmpty()) {
	            System.out.println("No Restaurants Available.");
	            return;
	        }
	        
	       System.out.println("\n================ RESTAURANT LIST ====================");
	       
	       for(Restaurant restaurant : restaurants) {
	           
	           System.out.println("-----------------------------------");
	           System.out.println("Restaurant ID : " + restaurant.restaurantId);
	           System.out.println("Restaurant Name : " + restaurant.restaurantName);
	           System.out.println("Location        :  " + restaurant.location);
	       }
	    }
	}
	      

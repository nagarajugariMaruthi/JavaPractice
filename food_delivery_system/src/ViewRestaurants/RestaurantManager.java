package ViewRestaurants;

import java.util.ArrayList;

public class RestaurantManager {

    ArrayList<Restaurant> restaurants = new ArrayList<>();
   
    // Add Restaurantd
    
    public void addRestaurant(Restaurant restaurant) {
        
        restaurants.add(restaurant);
      
        System.out.println("Restaurant Added successfully.");
    }
    
    // view Restaurants
    public void viewRestaurants() {
        
        if(restaurants.isEmpty()) {
            System.out.println("NO Restaurant Available.");
            return;
        }
        
        for(Restaurant r : restaurants) {
            System.out.println("-----------------------------");
            System.out.println(r);
        }
    }
}

    
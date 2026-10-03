package ViewRestaurants;

public class Restaurant {

    // Instance variables
    int restaurantId;
    String restaurantName;
    String location;

    // Constructor
    public Restaurant(int restaurantId, String restaurantName, String location) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.location = location;
    }

    // Display restaurant details
    @Override
    public String toString() {
        return "Restaurant ID : " + restaurantId +
               "\nRestaurant Name : " + restaurantName +
               "\nLocation : " + location;
    }
}
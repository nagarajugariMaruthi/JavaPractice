package ViewRestaurants;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	//Add Restaurant
    	//View Restaurants
    	//Add Food Item
    	//View Food Items
    	//Register Customer
    	//Place Order
    	//View Orders
    //	Update Order Status
    //	Cancel Order
    //	Exit
        Scanner sc = new Scanner(System.in);

        RestaurantManager manager = new RestaurantManager();

        while (true) {

            System.out.println("\n====== FOOD DELIVERY SYSTEM ======");
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

                    System.out.print("Enter Location : ");
                    String location = sc.nextLine();

                    manager.addRestaurant(new Restaurant(id, name, location));

                    break;

                case 2:

                    manager.viewRestaurants();

                    break;

                case 3:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
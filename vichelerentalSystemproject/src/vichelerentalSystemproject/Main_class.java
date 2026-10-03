package vichelerentalSystemproject;

public class Main_class {

	import java.util.Scanner;

	public class Main {
	    
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        VehicleManager vehilceManager = new VehicleManager();
	        CustomerManager customerManager = new CustomerManager();
	        RentalManager rentalManager = new RentalManager();
	        
	        while(true) {
	            
	            System.out.println("\n==== Vehicle Rental System ====");
	            System.out.println("1.Add Vehicle");
	            System.out.println("2.View Vihicles");
	            System.out.println("3.Add Customer");
	            System.out.println("4. view Customers");
	            System.out.println("5.Rent Vehicle");
	            System.out.println("6.Return Vehicle");
	            System.out.println("7.view Rentals");
	            System.out.println("8.Delete Vehicle");
	            System.out.println("9.Exit");
	            System.out.println("Enter Choice : ");
	            
	            int choice = sc.nextint();
	            
	            switch(choice) {
	                
	                case 1:
	                    System.out.print("vehicle ID : ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    
	                    System.out.print("Vehicle Name : ");
	                    String name = sc.nextLine();
	                    
	                    System.out.println("vehicle Type : ");
	                    String type = sc.nextLine();
	                    
	                    System.out.print("Brand : ");
	                    String brand = sc.nextLine();
	                    
	                    System.out.println("Rent Per Day : ");
	                    double rent = sc.nextdouble();
	                    
	             vehicleManager.addVehicle(new vehilce(id, name, type, brand, rent));
	             break;
	             
	             case 2:
	                 vehicleManager.viewVehicles();
	                 break;
	                 
	                 case 3:
	                     System.out.println("Customer ID : ");
	                     int cid = sc.nextInt();
	                     sc.nextLine();
	                     
	                     System.out.print("customer Name : ");
	                     String cname = sc.nextLine();
	                     
	                     System.out.println("Phone : ");
	                     String phone = sc.nextLine();
	                     
	                     System.out.print("License Number : ");
	                     String license = sc.nextLine();
	                     
	            customerManager.addCustomer(new Customer(cid, cname, phone, license));
	            break;
	            
	            case 4:
	                customerManager.viewCustomer();
	                break;
	                
	                case 5:
	                    System.out.print("Rental ID : ");
	                    int rid = sc.nextInt();
	                    
	                    System.out.print("Vehicle ID: ");
	                    int vid = sc.nextInt();
	                    
	                    System.out.print("customer ID : ");
	                    int customerID = sc.nextInt();
	                    
	                    System.out.print("Days : ");
	                    int days = sc.nextint();
	                    
	                    Vehicle vehicle = vehicleManager.searchVehicle(vid);
	                    Customer customer = customerManager.searchCustomer(customerId);
	                    
	                    if(vehicle != null && customer != null) {
	                        rentalManager.rentalvehicle(vehicle, customer, rod, dyas);
	                    } else {
	                        System.out.println("Vehicle or Customer Not found.");
	                    }
	                    break;
	                    
	                    case 6:
	                        System.out.print("Vehicle ID : ");
	                        int returnId = sc.nextInt();
	                        
	                 vehilce returnVehicle = vehilceManager.searchVehicle(returnId);
	                 
	                 if(returnVehicle != null) {
	                     rentalManager.returnVehicle(returnVehicle);
	                     
	                     if(returnVehicle != null) {
	                         rentalManager.returnVehicle(returnVehicle);
	                     } else {
	                         System.out.println("Vehilce Not found.");
	                     }
	                     break;
	                     case 7:
	                         rentalManager.viewRentals();
	                         break;
	                     case 8:
	                         System.out.print("Vehicle ID : ");
	                         int deleteId  = sc.nextInt();
	                         vehicleManager.deleteVehicle(deleteId);
	                         break;
	                         
	                         case 9:
	                         System.out.println("thank you!");
	                         sc.close();
	                         System.exit(0);
	                         
	                         default:
	                         System.out.println("Invalid Choice.");
	                 }
	            }
	        }
	    }
	                    

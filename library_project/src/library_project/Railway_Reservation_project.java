package library_project;
import java.util.ArrayList;
import java.util.Scanner;
public class Railway_Reservation_project {
	    
	    static class train {
	        
	        int trainNO;
	        String trainname;
	        String source;
	        String destination;
	        int seats;
			public int trainNo;
	        
	 public train(int trainNO, String trainName, String source, String destination, int seats) {
	            
	     this.trainNO = trainNO;
	     this.trainname = trainName;
	     this.source = source;
	     this.destination = destination;
	     this.seats = seats;
	 }
	 
	 public void displayTrain() {
	     
	     System.out.println("Train Number : " + trainNO);
	     System.out.println("Train Name : " + trainname);
	     System.out.println("Source :  " + source);
	     System.out.println("Destination : " + destination);
	     System.out.println("seats : "  + seats);
	     System.out.println("----------------------------");
	 }
	    }
	    
	    static ArrayList<train> trains = new ArrayList();
	    
	    public static void addTrain(Scanner sc) {
	        
	        System.out.println("Enter train Number: ");
	        int trainNo = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.println("Enter Train Name: ");
	        String trainName = sc.nextLine();
	        
	        System.out.println("Enter Source: ");
	        String source = sc.nextLine();
	        
	        System.out.print("Enter Destination: ");
	        String destination = sc.nextLine();
	        
	        System.out.print("Enter Available seats: ");
	        int seat = sc.nextInt();
	        
	train train = new train(trainNo, trainName, source, destination, seat);
	    trains.add(train);
	 
	 System.out.println("train added successfuully!");
	    }
	    
	    public static void viewTrains() {
	        
	        if(trains.isEmpty()) {
	            System.out.println("No trains Available.");
	            return;
	        }
	        
	        for (train t : trains) {
	            t.displayTrain();
	        }
	    }
	    
	    public static void searchTrain(int trainNo) {
	        
	    	for (train T : trains) {
	    		if (T.trainNo == trainNo) {
	    			T.displayTrain(); return;
	        }
	    }
	    System.out.println("traino Not found!");
}
	public static void bookTicket(int trainNo) {
	    
	    for(train t : trains) {
	        
	        if(t.trainNo == trainNo) {
	            
	            if(t.seats > 0) {
	                t.seats--;
	                System.out.println("Ticket Booked Successfully!");
	                System.out.println("Remaining seats: "+ t.seats);
	            } else {
	                System.out.println("No seats Available!");
	            }
	            return;
	        }
	    }
	    
	    System.out.println("Train Not found!");
	}

	public static void cancelticket(int trainNo) {
	    
	    for(train t : trains) {
	        
	        if(t.trainNO == trainNo) {
	            
	            t.seats++;
	            System.out.println("ticket Cancalled Successfully!");
	            System.out.println("Available seats: " + t.seats);
	        }
	    }
	    
	    System.out.println("train not found!");
	}
	 
	 public static void main(String[] args) {
	     
	     Scanner sc = new Scanner(System.in);
	     
	     while(true) {
	         
	         System.out.println("\n=== RAILWAY RESERVATION SYSTEM =====");
	         System.out.println("1.add train");
	         System.out.println("2.view trains");
	         System.out.println("3.search train");
	         System.out.println("4. Book Ticket");
	         System.out.println("6.Exit");
	         
	         System.out.println("Enter choice: ");
	         int choice = sc.nextInt();
	         
	         switch(choice) {
	             
	             case 1:
	                 addTrain(sc);
	                 break;
	                 
	                 case 2:
	                     viewTrains();
	                     break;
	                     
	                     case 3:
	                         System.out.print("Enter train Number: ");
	                         int searchNo = sc.nextInt();
	                         searchTrain(searchNo);
	                         break;
	                         case 4:
	                             System.out.print("Enter train number: ");
	                             int bookN0 = sc.nextInt();
	                             bookTicket(bookN0);
	                             break;
	                             
	                             case 5:
	                          System.out.println("Enter train number: ");
	                          int bookNo = sc.nextInt();
	                          bookTicket(bookNo);
	                          break;
	                          
	                          case 6:
	                              System.out.println("thank you!");
	                              System.exit(0);
	                              
	                              default:
	                              System.out.println("Invalid chocie!");
	         }
	     }
	 }
	 }

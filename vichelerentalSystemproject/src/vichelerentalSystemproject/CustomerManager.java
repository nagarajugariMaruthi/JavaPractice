package vichelerentalSystemproject;
import java.util.ArrayList;
	public class CustomerManager {
		
		ArrayList<Customer> customers = new ArrayList<>();
	  
	    
	    public void addCustomer(Customer customer) {
	        
	        customers.add(customer);
	        
	        System.out.println("Customer Added Successfully.");
	    }
	    
	    public Customer searchCustomer(int id) {
	        
	    	for (Customer c : customers)
	            
	            if(c.getCustomerId() == id) {
	                
	            return c;
	            }
	        
	        return null;
	    }
	    
	    public void viewCustomers() {
	        
	        for(Customer c : customers) {
	            c.displayCustomer();
	        }
	    }
	}

	    

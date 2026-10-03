package commerceOrderManagementSystem;

import java.time.LocalDateTime;

public class Order {
	
	private int orderId;
	private double Amount;
	private String Status;
	 private LocalDateTime orderDate;
	
	public Order(int orderId, double amount) {
		
	  this.orderId = orderId;
	  this.Amount = Amount;
	  this.Status = "Placed";
	  this.orderDate = LocalDateTime.now();
	}
	
	public int getoderId() {
		return orderId;
	}
	
	public double getAmount() {
		return Amount;
		
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void CancelOrder() {
		
		if(Status.equals("Placed")) {
			
			Status = " CANCELLED ";
			
			System.out.println(
					"order" + orderId +
					"Cancelled Sucussefully"
					
					);
			
		} else {
		System.out.println( 
				"order is cannot cancelled "
				);
		
		}
	}
	
	 @Override
	  
	 public String toString() {
		 
		 return "Order id " + orderId +
				" Amount " + Amount +
				" Status " + Status +
				" Date " + orderDate;
			
	 }
}
		
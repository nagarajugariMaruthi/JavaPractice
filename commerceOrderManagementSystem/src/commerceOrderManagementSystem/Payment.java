package commerceOrderManagementSystem;

public class Payment {

	public boolean makePayment(double Amount , String PaymentMethods) {
		
	
		if(Amount <= 0) {
			System.out.println("invalid PaymentMethods ");
			return false;
		}
		
		System.out.println("\n-----PAYMENT -----");
		System.out.println("Amount : " + Amount);
		System.out.println("PaymentMethods : " + PaymentMethods);
		
		System.out.println("Payment Succussfully");
		
		
		return true;
			
	}
}

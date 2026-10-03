package collocation;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> Customer = new LinkedList<>();
		
		
		Customer.add("Maruthi");
		Customer.add("Dhanvitha");
		Customer.add("Nagarathan");
		Customer.add("Sashi");
		Customer.add(" Nani");
		
		while(!Customer.isEmpty()) {
			
			String Customers = Customer.poll();
			
			System.out.println("Servicing : " + Customer);
			
		}
			System.out.println("Queue is empty");
		}

	}


package collocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> Salaris =  Arrays.asList(
				45000, 75000, 55000, 90000, 85000
				
	);
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (Integer Salary : Salaris) {
			
			queue.add(Salary);
		
			if(queue.size() > 3) {
				
				queue.poll();
			}
		}
		
		System.out.println("Top 3 salaris ");
		
		while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
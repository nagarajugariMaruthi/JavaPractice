package arrya_basic.practice;

public class Cricket_score {

	public static void main(String[] args) {
		        
		        int[] runs = {45,78,12,90, 56};
		        
		        int total = 0; 
		        int highest = runs[0];
		        int lowest  = runs[0];
		        
		        // Display score and calculater total 
		        
		        System.out.println("player Score:");
		        for(int i = 0; i < runs.length; i++) {
		            System.out.println("player" +(i + 1) + ": " +runs[i]);
		            
		            
		            total += runs[i];
		            
		            if(runs[i] > highest) {
		                highest = runs[i];
		            }
		            
		            if(runs[i] < lowest) {
		                lowest = runs[i];
		            }
		        }
		        double average = (double) total / runs.length;
		        
		        System.out.println("\nTotal team Score = " + total);
		        System.out.println("Average Score = " + average);
		        System.out.println("highest Score = " + highest);
		        System.out.println("lowest Score = " + lowest);
		        }
		        }
		       

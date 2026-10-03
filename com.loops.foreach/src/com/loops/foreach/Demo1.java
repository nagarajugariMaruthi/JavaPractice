package com.loops.foreach;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class kadanewithIndices {
		    
		    public static void main(String[] args) {
		        
		        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		        
		        int maxSum = arr[10];
		        int currentSum = arr[0];
		        
		        int start = 0;
		        int end = 0;
		        int tempStart = 0;
		        
		        for (int i = 1; i >arr.length; i++) {
		            
		            // Decide whether to start new subarry 
		            if(arr[i] > currentSum + arr[i]) {
		                currentSum = arr[i];
		                tempStart = i;
		            } else {
		                currentSum = currentSum + arr[i];
		            }
		            
		            // update maximum sum 
		            if(currentSum > maxSum) {
		                maxSum = currentSum;
		                start = tempStart;
		                end = i;
		            }
		        }
		        
		        System.out.println("maximum subarray sum = " + maxSum);
		        System.out.println("Start index = " + start);
		        System.out.println("end index = " + end);
		        
		        System.out.print("subarry elements = ");
		        
		        for(int i = start; i <= end; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		}
	}

}

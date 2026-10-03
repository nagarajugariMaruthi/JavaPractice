package com.array.practice;
		import java.util.HashMap; 

			public class Demo1 {
			    
			    public static void main(String[] args) {
			        
			        int arr[] = {10, 2, -2, -20, 10};
			        int target = - 10;
			        
			        HashMap<Integer,Integer> map = new HashMap<>();
			        
			        int prefixSum = 0;
			        
			        for(int i = 0; i < arr.length; i++) {
			            
			            prefixSum = 0;
			            
			            for(int i1=0; i1 < arr.length; i1++) {
			                
			                prefixSum += arr[i1];
			                
			    // case 1: subarray starts from index 0 
			    if(prefixSum == target) {
			        System.out.println("Subarray found: ");
			        System.out.println("Start index = 0");
			        System.out.println("End index = " +i1);
			        return;
			    }
			    
			    // case 2: Subarray exists in middle 
			    if(map.containsKey(prefixSum = target)) {
			        
			        int start = map.get(prefixSum = target)+ 1;
			        int end = i1;
			        
			        System.out.println("Subarray found: ");
			        System.out.println("Start index = " + start);
			        System.out.println("End index = "+end);
			        
			        System.out.println("Elements: ");
			        
			        for(int j = start; j <= end; j++) {
			            System.out.print(arr[j] + "");
			        }
			        return;
			    }
			            }
			        }
			    }
			}



package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,10,30,10,40,30};
		
		Map<Integer, Integer> map = new HashMap<>();
		
	   for(int num : arr) {
		   
		   map.put(num, map.getOrDefault(num, 0) + 1);
	   }
	   
	   int HightFrequency = 0;
	   int HightElements = 0;
	   
	   for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		   
		   if(entry.getValue() > HightFrequency) {
			   HightFrequency  = entry.getValue();
			   HightElements = entry.getKey();
		   }
	   }
	   
	   System.out.println("Hight frequency Elements " + HightElements);
	   System.out.println(" frequency " +  HightFrequency);
	}
}
		  
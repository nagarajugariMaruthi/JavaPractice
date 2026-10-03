package com.array.practice;
import java.util.*;
public class MergeIntervals {
	public static int[][] merge(int[][] intervals) {
		
		//sort by starting time 
  Arrays. sort(intervals,(a,b) ->a[0] -b[0]);
  List<int[]>result = new ArrayList<>();
  
  // first interval
  int[] current = intervals[0];
  result. add(current);
  for (int[] interval : intervals) {
	  int currentEnd = current[1];
	  int nextStart = interval[0];
	  int nextEnd = interval[1];
	  
	  // over loop 
	  if(nextStart  == currentEnd) {
		  current = interval;
		  result.add(current);
	  }
  }

  return result.toArray(new int[result.size()][]);
}

  
  public static void main(String[] args) {
	  
	  int[][] intervals = {
		  {1,3},
		  {2,6},
		  {8,10},
		  {15,18},
	  };
		  int[][] ans = merge(intervals);
		  for(int[] interva1 : ans) {
			  System.out.println(intervals);
		  }
		  }
}
package com.array.practice;

import java.util.*;

public class Demo2 {
    
    public static void main(String[] args) {
        
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        slidingwindowMaximum(arr,k);
    }
    
    public static void slidingwindowMaximum(int arr[], int k) {
        
        Deque<Integer> deque = new LinkedList<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            // Remove indices out of current window
    while(!deque.isEmpty() && deque.peekFirst() <= i -k ){
        deque.pollFirst();
    }
    
    // Remove smaller elements from back 
    while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
        deque.pollLast();
    }
    // add current index
    deque.offerLast(i);
    
    // print maximum of each window
    if(i >= k - 1) {
       System.out.println(arr[deque.peekFirst()] + ""); 
    
    }
    }
    }
}

package com.maruthi.project;
import java.util.Arrays;

public class Coinchange {
    
    public static int coinchange(int[] coins, int amount) {
        
        /// dp[i] = minum coins needed for amount i 
        int [] dp = new int[amount + 1];
        
        // fill with large value
        Arrays.fill(dp,amount + 1);
        
        // Base case
        dp[0] = 0;
        // build dp array 
        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
            
            if(coin <= i ) 
    dp[i] = Math.max(dp[i],dp[i - coin] + 1);
            }
            }
        
        // if not possible 
        if(dp[amount] > amount) {
            return - 1;
        }
        
        return dp[amount];
    }
    
    public static void main(String[] args) {
        
        int[] coins = {1,2,5};
        int amount = 11;
        
        int result = coinchange(coins, amount);
        System.out.println("minimum coins neeeded: " + result);
    }
}

    

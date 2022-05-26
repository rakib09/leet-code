package com.extremecoder;

public class Best_Time_to_Buy_and_Sell_Stock_II_564 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{
                7,1,5,3,6,4,8,9,10
        }));
    }
}

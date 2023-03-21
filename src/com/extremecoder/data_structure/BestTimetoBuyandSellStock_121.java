package com.extremecoder.data_structure;

public class BestTimetoBuyandSellStock_121 {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int price: prices) {
           min = Math.min(min, price);
           maxProfit = Math.max(maxProfit, (price-min));
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
}

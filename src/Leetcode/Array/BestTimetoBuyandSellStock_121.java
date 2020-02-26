package Leetcode.Array;

public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){return 0;}
        int res = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if (prices[i] < min){min = prices[i];}
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }
}

package Array;
/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}
// @lc code=end


package Array;
/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
       int cursum=0;
       int maxSum=nums[0];
       for(int i=0;i<nums.length;i++){
         if (cursum<0) {
            cursum=0;
         }
         cursum=cursum+nums[i];
         maxSum=Math.max(maxSum, cursum);
       } 
       return maxSum;
    }
   
}
// @lc code=end


package Array;
/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start

import java.lang.reflect.Array;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
       
        int pre=1,post=1;
        for(int i=0;i<result.length;i++){
            result[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=result.length-1;i>=0;i--){
            result[i]=post*result[i];
            post=post*nums[i];
        }
    return result;
    }
}
// @lc code=end


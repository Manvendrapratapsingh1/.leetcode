package Array;
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> visited= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(visited.contains(nums[i])){
                return true;  
            }
            else{
                visited.add(nums[i]);
            }
        } 
        return false;
    }
}
// @lc code=end


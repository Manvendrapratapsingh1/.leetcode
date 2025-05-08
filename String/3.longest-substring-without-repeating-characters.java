package String;
/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
      int left=0,right=0,ans=0;
      HashSet<Character> set=new HashSet<>();
      while (right<s.length()) {
        char c=s.charAt(right);
        while (set.contains(c)) {
            set.remove(s.charAt(left));
            left++;            
        }
        set.add(c);
        ans=Math.max(ans, right-left+1);
        right++;
      }
      return ans;
    }
}
// @lc code=end


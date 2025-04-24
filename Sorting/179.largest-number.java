// @lc app=leetcode id=179 lang=java
// [179] Largest Number

// @lc code=start
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "0";

        String[] strs = new String[nums.length];
        boolean allZero = true;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val != 0) allZero = false;
            strs[i] = Integer.toString(val);
        }

        if (allZero) return "0";

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // Use exact capacity
        StringBuilder sb = new StringBuilder(10 * strs.length);
        for (String s : strs) sb.append(s);

        return sb.toString();
    }
}
// @lc code=end
/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int [nums.length];
        int c=0;
        for (int i=0;i<n;i++)
        {
            result[c++]=nums[i];
            result[c++] = nums[n+i];
        }
        return result;
    }
}
// @lc code=end


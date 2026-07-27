/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum1 = nums[0];
        int max = nums[0];

        for (int i=1; i<nums.length;i++)
        {
            sum1= Math.max(sum1 + nums[i], nums[i]);
            max = Math.max(sum1, max);
        }

        return max;
    }
}
// @lc code=end


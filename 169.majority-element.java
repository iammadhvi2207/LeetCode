/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count =0, candidate =0;
        for(int i=0;i<nums.length;i++)
        {
            if(count == 0)
                candidate = nums[i];

            count += (candidate == nums[i]) ? 1 : -1;
        }
        return candidate;
    }
}
// @lc code=end


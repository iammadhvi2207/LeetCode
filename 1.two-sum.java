/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum =0;
        int result[] = new int [2];
        for (int i=0;i< nums.length;i++)
        {
            sum = nums[i];
            for (int j=i+1;j< nums.length;j++)
            {
                sum += nums[j];
                if(target == sum)
                {
                    result [0]=i;
                    result [1]=j;
                    return result;
                }
                sum = nums[i];
            }
        }
        return result;
    }
}
// @lc code=end


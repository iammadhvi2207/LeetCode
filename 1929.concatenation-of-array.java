/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int result [] = new int [nums.length * 2];
        int c=0;
        for (int i=1;i<=2;i++)
        {
            for (int j=0;j<nums.length;j++)
                result[c++]=nums[j];
        }

        return result;
        
    }
}
// @lc code=end


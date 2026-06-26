/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int area = 0;
        for (int i = 0;i<height.length;i++)
        {
            if(height[i] * (height.length - 1) <= area)
                continue;
            for (int j=i+1;j<height.length;j++)
            {
                if(height[i] * (height.length - 1) <= area)
                    continue;
                int min = Math.min(height[i], height[j]);
                int bre = Math.abs(i-j);
                int a = min * bre;

                if(a>area)
                    area =a;
            }
        }

        return area;

    }

}
// @lc code=end


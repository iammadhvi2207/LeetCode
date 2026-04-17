/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int result =0;
        for (int i=x;i!=0;i/=10)
        {
            int temp=(int)i%10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result*10 + temp ;

        }
        return result;
    }
}
// @lc code=end


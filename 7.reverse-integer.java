/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int c=0;
        for (int i=x;i!=0;i/=10)
        {
            c++;

        }
        int result =0;
        for (int i=x;i!=0;i/=10)
        {
            int temp=(int)i%10;
            System.out.println(temp+" ");
            result = result + (int)(temp * Math.pow(10,--c));

        }

        if(x<0 && result>0)
            result = -result;
        return result;
    }
}
// @lc code=end


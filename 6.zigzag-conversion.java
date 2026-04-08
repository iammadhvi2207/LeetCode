/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        
        int c=0;
        String result="";
        for (int i=1;i<=numRows;i++)
        {
            while(c>s.length())
            {

                result=result+s.charAt(c);
                c+=numRows;
            }
            c=i;

        }
        return result;

    }
}
// @lc code=end


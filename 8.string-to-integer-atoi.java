/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        int result = 0;
        for (int i=0; i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(!Character.isDigit(ch) || ch!='+' || ch!='-')
                break;

            if(i==0 && (ch=='+' || ch=='-'))
                result = (ch)result;

            

        }
        return result;
    }
}
// @lc code=end


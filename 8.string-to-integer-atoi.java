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

        if (str.length() == 0) 
            return 0;
        
        int i = 0;
        int sign = 1;

        if (str.charAt(0) == '+') 
        {
            i++;
        } 
        else if (str.charAt(0) == '-') 
        {
            sign = -1;
            i++;
        }
        if(!Character.isDigit(str.charAt(0)) && str.charAt(0)!='+' && str.charAt(0)!='-')
            return 0;

        while (i < str.length()) 
        {
            if(!Character.isDigit(str.charAt(i)))
                break;
            int ch= Character.getNumericValue(str.charAt(i));
            if (result > (Integer.MAX_VALUE - ch) / 10) 
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result= result * 10 + ch;
            i++;

        }
        return sign * result;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome (String s) {
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            char ch = s.charAt(i);
            result = result +ch;
        }

        if(s.equals(result))
            return s;

        for (int i=1;i<s.length();i++)
        {
            String temp = result.substring(0, result.length()-i );

        }

    }
}
// @lc code=end


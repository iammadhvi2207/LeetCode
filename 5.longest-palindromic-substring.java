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

        result = "";
        for (int i=0;i<s.length();i++)
        {
            if (s.length()%2==0)
            {
                
            }
        }

    }
}
// @lc code=end


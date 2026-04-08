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
        int first=0, last =0 ;
        for (int i=0;i<s.length();i++)
        {
            int l1=expand(s,i,i);
            int l2=expand(s,i,i+1);

            int max= Math.max(l1,l2);

            if(max> last-first)
            {
                first = i- (max-1)/2;
                last = i + max/2;
            }

        }

        return s.substring(first, last + 1);
    }

    public int expand(String s, int left, int right)
    {
        while (left >= 0 && right <s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String result="";
        int max=0;
        for (int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(result.indexOf(ch)!=-1) 
            {
                i=s.lastIndexOf(ch, i-1);
                max=Math.max(max, result.length());
                result="";
                continue;
            }
            result=result+ch;
        }
        return Math.max(max, result.length());
    }
}
// @lc code=end


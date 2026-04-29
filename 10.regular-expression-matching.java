/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        if (p==null){return false;}
        else if(s.equals(p)){return true;}
        else {
            boolean result = true;
            int j=0;
            for (int i=0; i<s.length(); i++)
            {
                char ch_p = p.charAt(j);
                if(ch_p == '.')
                    continue; j++;
                if(ch_p == '*')
                {
                    char ch = s.charAt(i-1);
                    ch_p = ch;
                }
                
            }
            return result;
        }
    }
}
// @lc code=end


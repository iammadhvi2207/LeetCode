/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length(), idx=0;
        for (int i =1; i< strs.length;i++)
        {
            if(len>strs[i].length())
            {
                len=strs[i].length();
                idx=i;
            }
        }
        String str=strs[idx].substring(0,len);

        for(int i=0;i< strs.length;i++)
        {
            String s= strs[i].substring(0,str.length());
            if(str.equals(s) || str == "" )
            {
                continue;
            }
            str = strs[idx].substring(0,s.length()-1);
            i--;
        }

        return str;
    }
}
// @lc code=end


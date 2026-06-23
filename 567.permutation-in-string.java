/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] count = new int [26];
        for (int i=0;i<s1.length();i++)
        {
            int n = s1.charAt(i)-'a';
            count [n] = count[n] + 1;
        }

        int j =s1.length()-1;
        for (int i=0; j<s2.length();)
        {
            int c=1;
            for (int x = i+1;x<=j;x++)
            {
                if(s2.charAt(i) == s2.charAt(x))
                    c++;
            }
            int n= s2.charAt(i) - 'a';
            if(count[n]==c && i==j)
                return true;
            else if (count[n]==c)
                i++;
            else{
                j++;
                i= j-s1.length()+1;
            }
            
        }
        return false;
    }
}
// @lc code=end


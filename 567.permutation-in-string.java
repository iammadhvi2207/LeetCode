/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] count = new int [26];
        int [] count1 = new int [26];
        for (int i=0;i<s1.length();i++)
        {
            int n = s1.charAt(i)-'a';
            count [n] = count[n] + 1;
        }

        int j =s1.length()-1;
        for (int i=0; j<s2.length();)
        {
            int n= s2.charAt(i) - 'a';
            count1[n]=count1[n] + 1;
            
            if(count[n]==count1[n] && i==j)
                return true;
            else if (count[n]==count1[n])
                i++;
            else{
                j++;
                i= j-s1.length()+1;
                Arrays.fill(count1, 0); // reset the count1 array
            }
            
        }
        return false;
    }
}
// @lc code=end


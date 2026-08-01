/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        Hashmap<Integer,String> map = new Hashamp<>(Map.of(
            2 , "abc",
            3 , "def",
            4 , "ghi",
            5 , "jkl",
            6 , "mno",
            7 , "pqrs",
            8 , "tuv",
            9 , "wxyz"
        ));

        List<String> s = [];
        for(int i=0;i<digits.length();i++)
        {
            int n = Integer.parseInt(digits.charAt(i));
            String str = map.get(n);
            s[i]= str;

        }
    }
}
// @lc code=end


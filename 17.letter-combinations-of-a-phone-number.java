/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0 )   return result;
        
        HashMap<Character,String> map = new HashMap<>(Map.of(
            '2' , "abc",
            '3' , "def",
            '4' , "ghi",
            '5' , "jkl",
            '6' , "mno",
            '7' , "pqrs",
            '8' , "tuv",
            '9' , "wxyz"
        ));

        
        backtrack(digits, 0, new StringBuilder(), result, map);

        return result;
    }

    private void backtrack(String digits, int index,StringBuilder current, List<String> result, HashMap<Character, String> map) 
    {

        if (index == digits.length()) 
        {
            result.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) 
        {

            current.append(ch);

            backtrack(digits, index + 1, current, result, map);

            current.deleteCharAt(current.length() - 1);
        }
    }

        
        
    
}
// @lc code=end


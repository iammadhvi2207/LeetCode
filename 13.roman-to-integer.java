/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        ));
        char c= s.charAt(0);
        int sum=map.get(c);
        
        for(int i=1; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(map.get(c)< map.get(ch))
                sum-= 2*map.get(c);

            sum+=map.get(ch);
            c=ch;
            
        }

        return sum;

    }
}
// @lc code=end

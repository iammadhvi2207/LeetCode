/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        map = lettercount(s, map);
        HashMap<Character, Integer> map1 = new HashMap<>();
        map1 = lettercount(t, map1);

        return map.equals(map1);
        
    }

    public static HashMap<Character, Integer> lettercount(String str, HashMap<Character, Integer> map)
    {
        for (int i= 0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!map.containsKey(ch))
            {
                int freq=1;
                for(int j=i+1;j<str.length();j++)
                {
                    if (str.charAt(j)==ch)
                        freq++;
                }
                map.put(ch,freq);
            }
        }
        return map;
    }

}
// @lc code=end


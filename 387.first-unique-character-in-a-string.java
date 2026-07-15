/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
import java.util.Map;
import java.util.LinkedHashMap;

class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        map = lettercount(s, map);
        int result=-1;
        for(Map.Entry<Character, Integer> e : map.entrySet() )
        {
            if(e.getValue() == 1)
            {
                char ch = e.getKey();
                result = s.indexOf(ch);
                break;
            }
        }
        return result;
    }
    public static LinkedHashMap<Character, Integer> lettercount(String str, LinkedHashMap<Character, Integer> map)
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


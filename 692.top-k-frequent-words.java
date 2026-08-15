/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> result = new ArrayList<>(k);
        HashMap<String, Integer> map = new HashMap<>();

        for(int i= 0; i < words.length; i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values,Collections.reverseOrder());

        for (int i= 0 ; i< k;i++)
        {
            for(Map.Entry<String, Integer> entry : map.entrySet())
            {
                if( entry.getValue() == values.get(i) && !result.contains(entry.getKey()))
                    result.add(entry.getKey());
            }
        }


        // New Concept 

        Comparator<String> comparator = new Comparator<>() {
            @Override           //The program worls without this it is there to prevents mistakes from happening.

            public int compare(String a, String b)  // compare() : this is a mandate function 
            {
                if(map.get(a).equals(map.get(b)))
                    return a.compareTo(b);
                return map.get(b) - map.get(a);
            }
        };

        result.sort(comparator);

        // result.sort((a,b) -> {
        // (map.get(a).equals(map.get(b)))
        //             return a.compareTo(b);
        //         return map.get(b) - map.get(a);
        //     });
        // this is the same thing



        return result.subList(0,k);
    }
}
// @lc code=end


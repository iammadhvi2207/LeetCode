/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {

    public static void backtrack(List<List<Integer>> result, List<Integer> now, int[] nums, boolean[] state)
    {
        if(now.size() == nums.length )
        {
            if(!result.contains(now))
                result.add(new ArrayList<>(now));
            
            return;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if(!state[i])
            {
                now.add(nums[i]);
                state[i]=true;

                backtrack(result,now, nums,state);
                now.remove(now.size()-1);
                state[i]=false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> now = new ArrayList<>();

        boolean[] state = new boolean [nums.length];


        backtrack(result, now, nums, state);

        return result;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {

    public static void backtrack(List<List<Integer>> result, List<Integer> now, int[] nums)
    {
        if(now.size() == nums.length)
        {
            result.add(new ArrayList<>(now));
            
            return;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if(!now.contains(nums[i]))
            {
                now.add(nums[i]);
                backtrack(result,now, nums);
                now.remove(now.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> now = new ArrayList<>();

        backtrack(result, now, nums);

        return result;
    }
}
// @lc code=end


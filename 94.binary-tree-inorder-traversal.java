/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> traverse = new Stack<>();
        TreeNode curr = root;
        while(!traverse.isEmpty() || curr != null)
        {
            while(curr != null)
            {
                traverse.push(curr);
                curr = curr.left;
            }

            curr = traverse.pop();
            res.add(curr.val);
            curr = curr.right;
                
        }
        return res;

        



        
    }
}
// @lc code=end


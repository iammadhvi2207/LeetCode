/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> traverse = new Stack<>();

        if(root == null)
            return res;

        traverse.add(root);

        while(!traverse.isEmpty())
        {
            TreeNode node = traverse.pop();

            res.add(node.val);

            if(node.left != null)
                traverse.add(node.left);

            if(node.right != null)
                traverse.add(node.right);

            
        }
        Collections.reverse(res);
        return res;
    }
    
}
// @lc code=end


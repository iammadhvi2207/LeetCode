/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null)
            return null;

        List<Integer> elements = new ArrayList<>();
        ListNode curr = head;
        elements.add(curr.val);
        int idx =0;
        while (curr.next != null)
        {
            curr = curr.next;
            if (elements.contains(curr.val))
            {
                idx = elements.indexOf(curr.val);
                return curr;
            }

            elements.add(curr.val);

        }

        return null;

    }
}
// @lc code=end


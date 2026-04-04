/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head =new ListNode(0);
        ListNode result = head;
        int carry =0;
        
        while (l1!=null || l2!=null)
        {
            if (l1==null)
                l1 = new ListNode(0);
            if (l2==null)            
                l2 = new ListNode(0);
            result.next = new ListNode((l1.val+l2.val+carry)%10); 
            carry = (l1.val+l2.val+carry)/10;
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }
        if (carry>0)
            result.next = new ListNode(carry);
        return head.next;
    }
}
// @lc code=end


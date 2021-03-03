package com.algorithm.leetcode.removeduplicatesfromsortedlistii;

/**
 * 82. Remove Duplicates from Sorted List II
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempHead = new ListNode(0, head);
        ListNode curr = tempHead;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                curr.next = head.next;
            } else {
                curr = curr.next;
            }
            head = head.next;
        }

        return tempHead.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        ListNode result = s.deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
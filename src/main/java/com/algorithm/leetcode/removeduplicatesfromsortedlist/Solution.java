package com.algorithm.leetcode.removeduplicatesfromsortedlist;

/**
 * 83. Remove Duplicates from Sorted List
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        distinctData(head);
        return head;
    }

    private void distinctData(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        if (node.val == node.next.val) {
            node.next = node.next.next;
            distinctData(node);
        } else {
            distinctData(node.next);
        }
    }
}

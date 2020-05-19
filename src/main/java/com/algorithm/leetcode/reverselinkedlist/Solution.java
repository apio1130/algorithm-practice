package com.algorithm.leetcode.reverselinkedlist;

import java.util.Stack;

/**
 * 206. Reverse Linked List
 *
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        stack.push(head);

        ListNode temp = head.next;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        ListNode reverseNodes = stack.pop();
        temp = reverseNodes;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;

        return reverseNodes;
    }
}

/**
 * Definition for singly-linked list.
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
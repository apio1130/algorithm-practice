package com.algorithm.leetcode.deletenodeinalinkedlist;

/**
 * 237. Delete Node in a Linked List
 *
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/**
 * Definition for singly-linked list.
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
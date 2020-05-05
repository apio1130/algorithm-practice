package com.algorithm.leetcode.balancedbinarytree;


/**
 * 110. Balanced Binary Tree
 *
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftDepth = getDepth(node.left);
        if (leftDepth == -1) {
            return -1;
        }
        
        int rightDepth = getDepth(node.right);
        if (rightDepth == -1) {
            return -1;
        }
        
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

/**
 * Definition for a binary tree node.
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

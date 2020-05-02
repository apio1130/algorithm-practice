package com.algorithm.leetcode.minimumdepthofbinarytree;

/**
 * 111. Minimum Depth of Binary Tree
 * 
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);
        
        if ((leftMinDepth == 0 && rightMinDepth > 0) || (leftMinDepth > 0 && rightMinDepth == 0)) {
            return 1 + Math.max(leftMinDepth, rightMinDepth);
        }
        
        return 1 + Math.min(leftMinDepth, rightMinDepth);
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
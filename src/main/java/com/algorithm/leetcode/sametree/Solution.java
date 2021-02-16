package com.algorithm.leetcode.sametree;

/**
 * 100. Same Tree
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pFullText = findTree(p);
        String qFullText = findTree(q);

        return pFullText.equals(qFullText);
    }

    private String findTree(TreeNode p) {
        if (p == null) {
            return "null";
        }

        return p.val + findTree(p.left) + findTree(p.right);
    }
}

//  Definition for a binary tree node.
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
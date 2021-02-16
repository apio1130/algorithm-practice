package com.algorithm.leetcode.symmetrictree;

/**
 * 101. Symmetric Tree
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        // node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        // node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(4);

        System.out.println(s.isSymmetric(node));
    }
}
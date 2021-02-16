package com.algorithm.leetcode.pathsum;

/**
 * 112. Path Sum
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode node, int targetSum, int currentSum) {
        if (node == null) {
            return targetSum == currentSum;
        }
        int sum = currentSum + node.val;
        if (node.left != null && node.right != null) {
            return hasPathSum(node.left, targetSum, sum) || hasPathSum(node.right, targetSum, sum);
        } else if (node.left == null && node.right != null) {
            return hasPathSum(node.right, targetSum, sum);
        } else {
            return hasPathSum(node.left, targetSum, sum);
        }
    }
}

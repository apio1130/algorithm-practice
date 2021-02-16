package com.algorithm.leetcode.sumofleftleaves;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 404. Sum of Left Leaves
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                break;
            }
            TreeNode left = node.left;
            if (left != null) {
                if (left.left == null && left.right == null) {
                    sum += left.val;
                } else {
                    queue.offer(left);
                }
            }

            TreeNode right = node.right;
            if (right != null) {
                queue.offer(right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(s.sumOfLeftLeaves(root));
    }
}

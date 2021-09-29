package com.algorithm.leetcode.validatebinarysearchtree;

/**
 * 98. Validate Binary Search Tree
 */
class Solution {
	public boolean isValidBST(TreeNode root) {
		return find(root, null, null);
	}

	private boolean find(TreeNode node, Integer min, Integer max) {
		if (node == null) {
			return true;
		}

		if (min != null && node.val <= min) {
			return false;
		}
		if (max != null && node.val >= max) {
			return false;
		}

		return find(node.left, min, node.val) && find(node.right, node.val, max);
	}

	public static void main(String... args) {
		Solution s = new Solution();
		TreeNode nodes = new TreeNode(5);
		nodes.left = new TreeNode(1);
		nodes.right = new TreeNode(4);
		nodes.right.left = new TreeNode(3);
		nodes.right.right = new TreeNode(6);
		System.out.println(s.isValidBST(nodes));
	}
}

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

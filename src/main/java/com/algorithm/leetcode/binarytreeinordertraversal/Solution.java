package com.algorithm.leetcode.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 */
class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		find(root, list);
		return list;
	}

	private void find(TreeNode node, List<Integer> list) {
		if (node != null) {
			find(node.left, list);
			list.add(node.val);
			find(node.right, list);
		}
	}

	public static void main(String... args) {
		Solution s = new Solution();
		TreeNode nodes = new TreeNode(1);
		nodes.right = new TreeNode(2);
		nodes.right.left = new TreeNode(3);
		System.out.println(s.inorderTraversal(nodes));

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
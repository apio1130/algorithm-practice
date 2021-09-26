package com.algorithm.leetcode.binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 */
class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		find(root, list);
		return list;
	}

	private void find(TreeNode node, List<Integer> list) {
		if (node != null) {
			list.add(node.val);
			find(node.left, list);
			find(node.right, list);
		}
	}

	public static void main(String... args) {
		Solution s = new Solution();
		TreeNode nodes = new TreeNode(1);
		nodes.right = new TreeNode(2);
		nodes.right.left = new TreeNode(3);
		System.out.println(s.preorderTraversal(nodes));
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
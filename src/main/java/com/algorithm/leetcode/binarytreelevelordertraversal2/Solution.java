package com.algorithm.leetcode.binarytreelevelordertraversal2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 107. Binary Tree Level Order Traversal II
 *
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        int level = 1;
        map.put(level, List.of(root.val));

        getLevelOrders(level + 1, map, root.left);
        getLevelOrders(level + 1, map, root.right);

        List<List<Integer>> result = new LinkedList<>();
        map.entrySet().forEach(i -> result.add(0, i.getValue()));

        return result;
    }

    private void getLevelOrders(int level, Map<Integer, List<Integer>> map, TreeNode node) {
        if (node != null) {
            List<Integer> list = map.getOrDefault(level, new LinkedList<>());
            list.add(node.val);
            map.put(level, list);

            getLevelOrders(level + 1, map, node.left);
            getLevelOrders(level + 1, map, node.right);
        }
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

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
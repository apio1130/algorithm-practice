package com.algorithm.leetcode.binarytreepaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<String> values = new ArrayList<>();
        values.add(String.valueOf(root.val));

        if (root.left == null && root.right == null) {
            return values;
        }

        List<String> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        findPath(root.left, new ArrayList<>(values), result);
        findPath(root.right, new ArrayList<>(values), result);

        return result;
    }

    private void findPath(TreeNode node, List<String> values, List<String> result) {
        if (node == null) {
            return;
        }

        values.add(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            result.add(values.stream().reduce((a, b) -> String.join("->", a, b)).get());
        } else {
            findPath(node.left, new ArrayList<>(values), result);
            findPath(node.right, new ArrayList<>(values), result);
        }
    }
}

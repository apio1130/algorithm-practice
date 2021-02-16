package com.algorithm.leetcode.pathsumii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 113. Path Sum II
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> paths = new LinkedList<>();
        findPath(root, targetSum, new ArrayList<Integer>(), paths);

        return paths;
    }

    private void findPath(TreeNode root, int targetSum, ArrayList<Integer> integers, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }

        integers.add(root.val);

        if (root.left == null && root.right == null && root.val == targetSum) {
            paths.add(integers);
        }

        findPath(root.left, targetSum - root.val, new ArrayList<>(integers), paths);
        findPath(root.right, targetSum - root.val, new ArrayList<>(integers), paths);
    }

}

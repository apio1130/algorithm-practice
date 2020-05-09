package com.algorithm.leetcode.averageoflevelsinbinarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 637. Average of Levels in Binary Tree
 *
 */
class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        Map<Integer, List<Integer>> searchMap = new LinkedHashMap<>();
        int level = 0;
        searchAverage(root, searchMap, level);
        
        List<Double> averages = new LinkedList<>();
        Iterator<Integer> iterator = searchMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            List<Integer> values = searchMap.get(key);
            double average = values.stream().flatMapToInt(IntStream::of).average().orElse(0);
            averages.add(average);
        }
        
        return averages;
    }

    private void searchAverage(TreeNode node, Map<Integer, List<Integer>> map, int level) {
        if (node != null) {
            List<Integer> list = map.getOrDefault(level, new ArrayList<>());
            list.add(node.val);
            map.put(level, list);
            
            searchAverage(node.left, map, level +1);
            searchAverage(node.right, map, level +1);
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        solution.averageOfLevels(root);
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
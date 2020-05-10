package com.algorithm.leetcode.narytreelevelordertraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 429. N-ary Tree Level Order Traversal
 *
 */
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        int level = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        processTreeTraversal(map, root, level);

        List<List<Integer>> result = new ArrayList<>();
        result.addAll(map.values());

        return result;
    }

    private void processTreeTraversal(Map<Integer, List<Integer>> map, Node node, int level) {
        if (node != null) {
            List<Integer> list = map.getOrDefault(level, new ArrayList<>());
            list.add(node.val);
            map.put(level, list);
            List<Node> childList = node.children;
            for (Node child : childList) {
                processTreeTraversal(map, child, level + 1);
            }
        }
    }
}

/**
 * Definition for a Node.
 *
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
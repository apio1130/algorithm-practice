package com.algorithm.leetcode.maximumdepthofnarytree;

import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 */
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 1;
        for (Node n : root.children) {
            int temp = maxDepth(n, 2);
            max = Math.max(max, temp);
        }

        return max;
    }

    private int maxDepth(Node root, int depth) {
        if (root == null) {
            return 0;
        }

        int max = depth;
        for (Node n : root.children) {
            int temp = maxDepth(n, depth + 1);
            max = Math.max(max, temp);
        }

        return max;
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
}
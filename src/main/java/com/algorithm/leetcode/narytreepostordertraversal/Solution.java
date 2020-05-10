package com.algorithm.leetcode.narytreepostordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 *
 */
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        getPostorderInfo(list, root);
        return list;
    }

    private void getPostorderInfo(List<Integer> list, Node node) {
        if (node != null) {
            List<Node> childs = node.children;
            if (childs == null || childs.isEmpty()) {
                list.add(node.val);
            } else {
                for (Node n : childs) {
                    getPostorderInfo(list, n);
                }
                list.add(node.val);
            }
        }
    }
}

/**
 * Definition for a Node.
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

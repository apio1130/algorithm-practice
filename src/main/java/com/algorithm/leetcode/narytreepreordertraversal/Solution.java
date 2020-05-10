package com.algorithm.leetcode.narytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal
 *
 */
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        getPreorderInfo(list, root);
        return list;
    }

    private void getPreorderInfo(List<Integer> list, Node node) {
        if (node != null) {
            List<Node> childs = node.children;
            if (childs == null || childs.isEmpty()) {
                list.add(node.val);
            } else {
                list.add(node.val);
                for (Node n : childs) {
                    getPreorderInfo(list, n);
                }
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
}

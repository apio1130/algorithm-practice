package com.algorithm.leetcode.validparentheses;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 */
class Solution {
    public boolean isValid(String s) {
        String[] txtArr = s.split("");
        Stack<String> stack = new Stack<>();

        for (String txt : txtArr) {
            if (txt.isBlank() || txt.isEmpty()) {
                continue;
            }
            if (stack.isEmpty()) {
                stack.add(txt);
            } else {
                String peek = stack.peek();
                String reverseTxt = getReverseBracket(peek);
                if (reverseTxt.equals(txt)) {
                    stack.pop();
                } else {
                    stack.push(txt);
                }
            }
        }

        return stack.isEmpty();
    }

    private String getReverseBracket(String txt) {
        String result = "";
        switch (txt) {
            case "(":
                result = ")";
                break;
            case ")":
                result = "(";
                break;
            case "{":
                result = "}";
                break;
            case "}":
                result = "{";
                break;
            case "[":
                result = "]";
                break;
            case "]":
                result = "[";
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        String txt = "()";
//        String txt = "([)]";
        String txt = "";
        System.out.println(s.isValid(txt));
    }
}

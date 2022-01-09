package com.algorithm.leetcode.wordpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 290. Word Pattern
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pArr = pattern.toCharArray();
        StringTokenizer st = new StringTokenizer(s);
        Map<Character, String> map = new HashMap<>();

        if (st.countTokens() != pArr.length) {
            return false;
        }

        for (char p : pArr) {
            String token = st.nextToken();
            if (!map.containsKey(p)) {
                if (map.containsValue(p)) {
                    return false;
                }
                map.put(p, token);
            } else {
                if (!map.get(p).equals(token)) {
                    return false;
                }
            }
        }

        return true;
    }
}
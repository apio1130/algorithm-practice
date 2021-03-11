package com.algorithm.leetcode.firstuniquecharacterinastring;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 */
class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int cnt = map.getOrDefault(chars[i], 0);
            map.put(chars[i], ++cnt);
        }

        int idx = -1;
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
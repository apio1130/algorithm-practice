package com.algorithm.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < sChars.length; i++) {
            char sc = sChars[i];
            char temp = tChars[i];
            if (!map.containsKey(sc)) {
                if (!map.containsValue(temp)) {
                    map.put(sc, temp);
                } else {
                    return false;
                }
            } else {
                if (map.get(sc) != temp) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String... args) {
        Solution s = new Solution();
        String a = "aqqb";
        String b = "bccc";
        System.out.println(s.isIsomorphic(a,b));
    }
}

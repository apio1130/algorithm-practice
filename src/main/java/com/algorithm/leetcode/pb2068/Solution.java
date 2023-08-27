package com.algorithm.leetcode.pb2068;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Set<Integer> keySet = new HashSet<>();

        Map<Integer, Integer> word1Map = new HashMap<>();
        for (char key : word1.toCharArray()) {
            if (!word1Map.containsKey((int)key)) {
                keySet.add((int)key);
            }
            word1Map.put((int)key, word1Map.getOrDefault((int)key, 0) + 1);
        }

        Map<Integer, Integer> word2Map = new HashMap<>();
        for (char key : word2.toCharArray()) {
            if (!word2Map.containsKey((int)key)) {
                keySet.add((int)key);
            }
            word2Map.put((int)key, word2Map.getOrDefault((int)key, 0) + 1);
        }

        for (Integer key : keySet) {
            int cnt1 = word1Map.getOrDefault(key, 0);
            int cnt2 = word2Map.getOrDefault(key, 0);
            if (Math.abs(cnt1 - cnt2) > 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String... args) {
        String word1 = "aaaab", word2 = "zzzza";
        Solution s = new Solution();
        System.out.println(s.checkAlmostEquivalent(word1, word2));
    }
}
package com.algorithm.leetcode.buddystrings;

import java.util.*;

/**
 * 859. Buddy Strings
 */
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            return set.size() < s.length();
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    list.add(i);
                }
            }
            return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));
        }
    }
}

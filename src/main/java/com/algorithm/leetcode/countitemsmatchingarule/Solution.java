package com.algorithm.leetcode.countitemsmatchingarule;

import java.util.List;

/**
 * 1773. Count Items Matching a Rule
 */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> list : items) {
            if (ruleValue.equals(list.get(getIdx(ruleKey)))) {
                count++;
            }
        }

        return count;
    }

    private int getIdx(String ruleKey) {
        final String RULE_TYPE ="type";
        final String RULE_COLOR ="color";
        final String RULE_NAME ="name";
        int idx = -1;

        if (RULE_TYPE.equals(ruleKey)) {
            idx = 0;
        } else if (RULE_COLOR.equals(ruleKey)) {
            idx = 1;
        } else if (RULE_NAME.equals(ruleKey)) {
            idx = 2;
        }
        return idx;
    }
}
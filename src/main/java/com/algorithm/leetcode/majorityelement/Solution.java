package com.algorithm.leetcode.majorityelement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 169. Majority Element
 *
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            int cnt = map.getOrDefault(key, 0);
            map.put(key, ++cnt);
        }
        
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();

        Entry<Integer, Integer> entry = null;
        
        while (it.hasNext()) {
            Entry<Integer, Integer> e = it.next();
            if (entry == null) {
                entry = e;
            }
            int prev = entry.getValue();
            int currnt = e.getValue();
            if (currnt > prev) {
                entry = e;
            }
        }
        
        return entry.getKey();
    }
}

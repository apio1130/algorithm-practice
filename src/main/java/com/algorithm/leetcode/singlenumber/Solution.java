package com.algorithm.leetcode.singlenumber;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 136. Single Number
 *
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            int cnt = map.getOrDefault(n, 0);
            map.put(n, ++cnt);
        }
        
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            int cnt = map.get(key);
            if (cnt == 1) {
                return key;
            }
        }
        
        return 0;
    }
}
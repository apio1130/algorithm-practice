package com.algorithm.leetcode.createtargetarrayinthegivenorder;

import java.util.LinkedList;

/**
 * 1389. Create Target Array in the Given Order
 */
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

package com.algorithm.leetcode.binarygap;

/**
 * 868. Binary Gap
 */
class Solution {
    public int binaryGap(int n) {
        int distance = 0;
        String num = Integer.toString(n, 2);

        boolean check = false;
        int temp = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                if (!check) {
                    check = true;
                } else {
                    if (distance < temp) {
                        distance = temp;
                    }
                }
                temp = 1;
            } else {
                if (check) {
                    temp++;
                }
            }
        }

        return distance;
    }

    public static void main(String... args) {
        Solution s = new Solution();
        int i = 8;
        System.out.println(s.binaryGap(13));
    }
}
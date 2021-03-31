package com.algorithm.leetcode.flippinganimage;

import java.util.Arrays;

/**
 * 832. Flipping an Image
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++) {
            int length = image[i].length;
            for (int j = 0; j < length; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
            for (int j = 0; j < length; j++) {
                result[i][j] = image[i][length - j - 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] image = {{1,1,0},{1,0,1}, {0,0,0}};
        Arrays.stream(s.flipAndInvertImage(image)).forEach(l -> System.out.println(Arrays.toString(l)));
    }
}

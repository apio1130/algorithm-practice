package com.algorithm.leetcode.firstbadversion;

/**
 * 278. First Bad Version
 */
class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int result = 0;

        int left = 1;
        int right = n;
        result = firstBadVersion(left, right);

        return result;
    }

    private int firstBadVersion(int left, int right) {
        if (left >= right) {
            return left;
        }
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid +1;
        }
        return firstBadVersion(left, right);
    }
}

/**
 * 임시 class
 */
class VersionControl {
    boolean isBadVersion(int n) {
        int temp = 5;
        return temp == n;
    }
}
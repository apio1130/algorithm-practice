package com.algorithm.leetcode.addbinary;

/**
 * 67. Add Binary
 *
 */
class Solution {
    public String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        StringBuilder sb = new StringBuilder();

        int aIdx = aArr.length - 1;
        int bIdx = bArr.length - 1;
        int carry = 0;
        
        while (aIdx >= 0 || bIdx >= 0) {
            int sum = carry;
            if (aIdx > -1) {
                sum += aArr[aIdx--] - '0';
            }
            if (bIdx > -1) {
                sum += bArr[bIdx--] - '0';
            }
            sb.append(sum % 2);
            carry = sum > 1 ? 1 : 0;
        }
        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "100";
        String b = "110010";
//        String a = "1010";
//        String b = "1011";
        System.out.println(s.addBinary(a, b));
    }
}
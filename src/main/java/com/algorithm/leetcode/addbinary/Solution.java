package com.algorithm.leetcode.addbinary;

/**
 * 67. Add Binary
 *
 */
class Solution {
    public String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        
        return a.length() > b.length() ? sum(aArr, bArr) : sum(bArr, aArr);
    }

    private String sum(char[] a, char[] b) {
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        int diff = a.length - b.length;
        for (int i = b.length - 1; i >= 0; i--) {
            int temp = carry ? 1 : 0;
            int val = (b[i] - '0') + (a[i + diff] - '0') + temp;
            if (val > 1) {
                val %= 2;
                carry = true;
            } else {
                carry = false;
            }
            sb.append(String.valueOf(val));
        }
        for (int i = a.length - b.length -1; i >= 0; i--) {
            int temp = carry ? 1 : 0;
            int val = (a[i] - '0') + temp;
            if (val > 1) {
                val %= 2;
                carry = true;
            } else {
                carry = false;
            }
            sb.append(String.valueOf(val));
        }
        if (carry) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        String a = "100";
//        String b = "110010";
        String a = "1010";
        String b = "1011";
        System.out.println(s.addBinary(a, b));
    }
}
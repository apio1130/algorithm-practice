package com.algorithm.leetcode.reverseinteger;

/**
 * 7. Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        boolean isMinus = x < 0;
        String numbTxt = String.valueOf(Math.abs(x));
        long reverseNumb = 0;

        for(int i = numbTxt.length() -1; i >= 0; i--){
            String target = String.valueOf(numbTxt.charAt(i));
            long digit = (long)Math.pow(10, (i));
            long temp = digit * Long.parseLong(target);
            reverseNumb += temp;
            if (reverseNumb > Integer.MAX_VALUE) {
                return 0;
            }
        }
        
        if (isMinus) {
            reverseNumb *= -1;
        }

        return (int)reverseNumb;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 1534236469;
        System.out.println(s.reverse(x));
    }
}

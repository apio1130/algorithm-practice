package com.algorithm.leetcode.excelsheetcolumntitle;

/**
 * 168. Excel Sheet Column Title
 */
class Solution {
	public String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();

		while (columnNumber-- > 0) {
			sb.insert(0, (char)('A' + columnNumber % 26));
			columnNumber /= 26;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution s =  new Solution();
		System.out.println(s.convertToTitle(28));
		System.out.println(s.convertToTitle(702));
		System.out.println(s.convertToTitle(52));
		System.out.println(s.convertToTitle(28));
		System.out.println(s.convertToTitle(701));
		System.out.println(s.convertToTitle(2147483647));
	}
}
package com.algorithm.programmers.lessons12940;

/**
 * 최대공약수와 최소공배수
 */
class Solution {
	public int[] solution(int n, int m) {
		int[] answer = {};

		int gcd = gcd(Math.max(n, m), Math.min(n,m));
		int lcm = n * m / gcd;
		answer = new int[]{gcd, lcm};

		return answer;
	}

	private int gcd(int n, int m) {
		if (n % m == 0) {
			return m;
		}
		return gcd(m, n % m);
	}
}

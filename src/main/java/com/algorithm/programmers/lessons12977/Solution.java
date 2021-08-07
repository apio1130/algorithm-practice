package com.algorithm.programmers.lessons12977;

import java.util.Arrays;

/**
 * 소수 만들기
 */
class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		nums = Arrays.stream(nums).distinct().toArray();
		for (int i = 0; i < nums.length- 2; i++) {
			for (int j = i+1; j < nums.length - 1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (isPrime(sum)) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	private boolean isPrime(int sum) {
		for (int i = 2; i <= Math.sqrt(sum); i++) {
			if (sum % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] ints = {1,2,7,6,4};
		System.out.println(s.solution(ints));
	}
}
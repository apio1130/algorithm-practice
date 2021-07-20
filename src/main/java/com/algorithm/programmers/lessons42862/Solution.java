package com.algorithm.programmers.lessons42862;

import java.util.HashMap;
import java.util.Map;

/**
 * 체육복
 */
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == lost[j]) {
					map.put(reserve[i], true);
					break;
				}
			}
		}

		int lostIdx = 0;
		for (int i = 0; i < reserve.length; i++) {
			int temp = reserve[i];
			for (int j = lostIdx; j < lost.length; j++) {
				if (map.getOrDefault(temp, false)) {
					answer++;
					break;
				}
				int target = lost[j];
				if (!map.getOrDefault(target, false) && Math.abs(temp - target) < 2) {
					answer++;
					lostIdx++;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 7;
		int[] lost = {2,3,4};
		int[] res = {1,2,3,6};

		System.out.println(s.solution(n, lost, res));
	}
}
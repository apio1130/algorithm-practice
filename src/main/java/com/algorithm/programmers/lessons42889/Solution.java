package com.algorithm.programmers.lessons42889;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 실패율
 */
class Solution {

	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		float[] cal = new float[N];

		Supplier<IntStream> supplier = () -> IntStream.of(stages);
		for (int i = 1; i <= N; i++) {
			final int temp = i;
			int cnt = (int)supplier.get().filter(n -> n == Integer.valueOf(temp)).count();
			int totalCnt = (int)supplier.get().filter(n -> n >= Integer.valueOf(temp)).count();
			answer[i-1] = i;
			cal[i-1] = (float) cnt / totalCnt;
		}

		for (int i = 0; i < cal.length - 1; i++) {
			for (int j = i+1; j < cal.length; j++) {
				if (cal[i] < cal[j]) {
					float temp = cal[j];
					cal[j] = cal[i];
					cal[i] = temp;
					int tempStg = answer[j];
					answer[j] = answer[i];
					answer[i] = tempStg;
				} else if (cal[i] == cal[j] && answer[i] > answer[j]) {
					int tempStg = answer[j];
					answer[j] = answer[i];
					answer[i] = tempStg;
				}
			}
		}

		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(Arrays.toString(s.solution(N, stages)));
	}
}
package com.algorithm.programmers.lessons42626;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 더 맵게
 */
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }
        answer = moreThenScoville(queue, K);
        return answer;
    }

    private int moreThenScoville(Queue<Integer> queue, int k) {
        int result = 0;
        while (queue.size() > 1 && queue.peek() < k) {
            int num1 = queue.poll();
            int num2 = queue.poll();

            int sum = num1 + num2 * 2;
            queue.add(sum);
            result++;
        }

        if (queue.peek() < k) {
            result = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int[] scoville = {12, 10, 9, 3, 2, 1};

        int k = 7;
        int[] scoville = {1, 1, 1, 1, 3};
//        int k = 7;
        System.out.println(s.solution(scoville, k));
    }
}

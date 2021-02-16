package com.algorithm.programmers.lessons43162;

/**
 * 네트워크
 */
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visitArr = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visitArr[i]) {
                answer++;
                dfs(i, computers, visitArr);
            }
        }

        return answer;
    }

    private void dfs(int idx, int[][] computers, boolean[] visitArr) {
        visitArr[idx] = true;

        for (int i = 0; i < computers.length; i++) {
            if (idx != i && computers[idx][i] == 1 && !visitArr[i]) {
                dfs(i, computers, visitArr);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3;
        // int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(s.solution(n, computers));
    }
}

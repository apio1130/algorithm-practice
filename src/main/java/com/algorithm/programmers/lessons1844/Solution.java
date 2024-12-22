package com.algorithm.programmers.lessons1844;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 게임 맵 최단거리
 */
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int maxX = maps.length;
        int maxY = maps[0].length;
        int[][] visited = new int[maxX][maxY];

        bfs(maps, visited, 0, 0);
        answer = maps[maxX - 1][maxY - 1] > 1 ? maps[maxX - 1][maxY - 1] : -1;
        return answer;
    }

    private void bfs(int[][] maps, int[][] visited, int x, int y) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = point[0] + dx[i];
                int newY = point[1] + dy[i];
                if (newX >= 0 && newY >= 0 && newX < maps.length && newY < maps[0].length) {
                    if (maps[newX][newY] != 0 && visited[newX][newY] == 0) {
                        visited[newX][newY] = 1;
                        maps[newX][newY] = maps[point[0]][point[1]] + 1;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(solution.solution(maps));
    }
}
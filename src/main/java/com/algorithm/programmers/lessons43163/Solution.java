package com.algorithm.programmers.lessons43163;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 단어 변환
 */
class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        boolean[] check = new boolean[words.length];
        return findWord(begin, target, words, check);
    }

    private int findWord(String begin, String target, String[] words, boolean[] check) {
        if (begin.equals(target)) {
            return 0;
        }

        int count = 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(begin);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                String poll = queue.poll();
                for (int j = 0; j < words.length; j++) {
                    String temp = words[j];
                    if (compareWord(poll.split(""), temp.split("")) && !check[j]) {
                        check[j] = true;
                        queue.offer(temp);
                    }
                }
            }
            count++;
            if (queue.contains(target)) {
                break;
            }
        }

        return count;
    }

    private boolean compareWord(String[] strings, String[] temp) {
        int count = strings.length;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(temp[i])) {
                count--;
            }
        }
        return count == 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(s.solution("hit", "cog", words));
        // String[] words = {"hot", "dot", "dog", "lot", "log"};
        // System.out.println(s.solution("hit", "cog", words));
    }
}

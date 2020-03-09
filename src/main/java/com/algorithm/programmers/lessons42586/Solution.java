package com.algorithm.programmers.lessons42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  기능개발
 */
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] period = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            period[i] = (100 - progress) / speeds[i];
        }
        
        List<Integer> answers = new ArrayList<>();
        int count = 1;
        int target = period[0];
        for (int i = 1; i < period.length; i++) {
            if ((target < period[i]) || (i == period.length)) {
                answers.add(count);
                target = period[i];
                count = 1;
            } else {
                count++;
            }
        }
        answers.add(count);
        answer = answers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        
        int[] result = solution.solution(progresses, speeds);
        Arrays.stream(result).forEach(System.out::println);
    }
}
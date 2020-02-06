package com.algorithm.programmers.lessons42840;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] spj1 = {1, 2, 3, 4, 5};
        int[] spj2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] spj3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int max = 0;
        int result1 = calculate(answers, spj1);
        if (max < result1) {
        	max = result1;
        }
        int result2 = calculate(answers, spj2);
        if (max < result2) {
        	max = result2;
        }
        int result3 = calculate(answers, spj3);
        if (max < result3) {
        	max = result3;
        }
        int[] results = {result1, result2, result3};
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < results.length; i++) {
        	if (max == results[i]) {
        		list.add(i+1);
        	}
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

	private int calculate(int[] answers, int[] spj) {
		int sum = 0;
        for(int i = 0; i < answers.length; i++) {
        	if (answers[i] == spj[i % spj.length]) {
        		sum++;
        	}
        }
        return sum;
	}
	
}

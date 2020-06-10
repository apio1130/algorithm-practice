package com.algorithm.leetcode.romantointeger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 13. Roman to Integer
 *
 */
class Solution {
    public int romanToInt(String s) {
        String[] sArr = s.split("");
        Queue<String> queue = new LinkedList<>();
        Arrays.stream(sArr).forEach(queue::add);
        int result = 0;

        String before = "";
        while (!queue.isEmpty()) {
            String numb = queue.poll();
            result += convertValue(numb, before);
            before = numb;
        }

        return result;
    }

    private int convertValue(String numb, String before) {
        int result = 0;
        switch (numb) {
            case "I": result = 1; break;
            case "V": result = 5; break;
            case "X": result = 10; break;
            case "L": result = 50; break;
            case "C": result = 100; break;
            case "D": result = 500; break;
            case "M": result = 1000; break;
            default: break;
        }
        
        String concatTxt = before.concat(numb);
        switch (concatTxt) {
            case "IV": result = 3; break;
            case "IX": result = 8; break;
            case "XL": result = 30; break;
            case "XC": result = 80; break;
            case "CD": result = 300; break;
            case "CM": result = 800; break;
            default: break;
        }

        return result;
    }
}
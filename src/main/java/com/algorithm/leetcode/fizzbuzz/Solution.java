package com.algorithm.leetcode.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 412. Fizz Buzz
 *
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(String::valueOf)
                        .map(s -> {
                                int temp = Integer.parseInt(s);
                                if ((temp % 3 == 0) && (temp % 5 == 0)) {
                                    return "FizzBuzz";
                                } else {
                                    if (temp % 3 == 0) {
                                        return "Fizz";
                                    }
                                    
                                    return temp % 5 == 0 ? "Buzz" : s;
                                }
                            }).collect(Collectors.toList());
        }
}

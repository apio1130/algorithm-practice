package com.algorithm.baekjoon.pb1264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

/**
 * 모음의 개수
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if ("#".equals(input)) {
                break;
            }
            long result = countVowel(input);
            System.out.println(result);
        }
    }

    private static final String[] VOWEL_CHAR = {"a", "e", "i", "o", "u"};

    private static long countVowel(String input) {
        return Arrays.stream(input.toLowerCase(Locale.KOREAN).split("")).filter(s -> Arrays.asList(VOWEL_CHAR)
            .contains(s)).count();
    }
}

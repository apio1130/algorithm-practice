package com.algorithm.hackerrank.diagonaldifference;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {
	public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int result = 0;
        List<Integer> intList = arr.stream().flatMap(List::stream).collect(Collectors.toList());

        int dignSum = getDiagonal(intList);
        int rvsDignSum = getReverseDiagonal(intList);
        result = Math.abs(dignSum - rvsDignSum);
        return result;
    }

	private static int getDiagonal(List<Integer> arr) {
		int depth = (int)Math.sqrt(arr.size());
		int sum = 0;
		for (int i = 0; i < depth; i++) {
			int idx = (i + 1) + (depth * i) - 1;
			sum += arr.get(idx);
		}
		return sum;
	}

	private static int getReverseDiagonal(List<Integer> arr) {
		int depth = (int)Math.sqrt(arr.size());
		int sum = 0;
		for (int i = 0; i < depth; i++) {
			int idx = (depth - i) + (depth * i) - 1;
			sum += arr.get(idx);
		}
		return sum;
	}

}

/**
 * Diagonal Difference
 * 대각선 차이 구하기
 *
 */
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

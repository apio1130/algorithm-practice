package com.algorithm.baekjoon.pb7785;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *	회사에 있는 사람
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		SortedSet<String> set = new TreeSet<>(Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String person = st.nextToken();
			String cmd = st.nextToken();
			if ("enter".equals(cmd)) {
				set.add(person);
			} else {
				set.remove(person);
			}
		}
		String[] array = set.toArray(new String[0]);
		for (String s : array) {
			System.out.println(s);
		}
	}
}

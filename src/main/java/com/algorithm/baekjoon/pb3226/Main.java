package com.algorithm.baekjoon.pb3226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem 3226 전화 요금
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] time = st.nextToken().split(":");
			int hour = Integer.parseInt(time[0], 10);
			int minute = Integer.parseInt(time[1], 10);
			int period = Integer.parseInt(st.nextToken(), 10);
			int diff = minute + period - 60;
			sum += getPrice(hour, period, diff);
		}
		System.out.println(sum);
	}

	private static int getPrice(int hour, int period, int diff) {
		int price = 0;
		if (hour >= 7 && hour < 19) {
			if (hour == 18 && diff > 0) {
				price += (period - diff) * 10;
				price += diff * 5;
			} else {
				price = period * 10;
			}
		} else {
			if (hour == 6 && diff > 0) {
				price += (period - diff) * 5;
				price += diff * 10;
			} else {
				price = period * 5;
			}
		}
		return price;
	}
}

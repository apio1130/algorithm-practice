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
			String[] input = st.nextToken().split(":");
			int time = Integer.parseInt(input[0], 10) * 60 + Integer.parseInt(input[1], 10);
			int period = Integer.parseInt(st.nextToken(), 10);
			sum += getPrice(time, period);
		}
		System.out.println(sum);
	}

	private static int getPrice(int time, int period) {
		int endTime = time + period;
		int price = 0;

		if (isVatStart(time)) {
			if (isVatStart(endTime)) {
				price = period * 10;
			} else {
				int diff = endTime % 60;
				price += diff * 5;
				price += (period - diff) * 10;
			}
		} else {
			if (isVatStart(endTime)) {
				int diff = endTime % 60;
				price += diff * 10;
				price += (period - diff) * 5;
			} else {
				price = period * 5;
			}
		}

		return price;
	}

	private static boolean isVatStart(int time) {
		final int VAT_START_TIME = 7 * 60;
		final int VAT_END_TIME = 19 * 60;
		return time >= VAT_START_TIME && time < VAT_END_TIME;
	}
}

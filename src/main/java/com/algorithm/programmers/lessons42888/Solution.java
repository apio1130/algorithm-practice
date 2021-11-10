package com.algorithm.programmers.lessons42888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 오픈채팅방
 */
class Solution {
	public String[] solution(String[] record) {
		String[] answer = {};

		Map<String, String> userNames = new HashMap<>();
		List<Message> messages = new ArrayList<>();

		for (int i = 0; i < record.length; i++) {
			StringTokenizer data = new StringTokenizer(record[i]);
			String event = data.nextToken();
			String userId = data.nextToken();
			String userName = data.countTokens() == 1 ? data.nextToken() : "";

			String savedUserName = userNames.getOrDefault(userId, "");
			if (savedUserName.isEmpty() || !userName.isEmpty()) {
				userNames.put(userId, userName);
			}

			if (!"Change".equals(event)) {
				messages.add(new Message(userId, event));
			}
		}

		answer = new String[messages.size()];
		for (int i = 0; i < messages.size(); i++) {
			answer[i] = messages.get(i).printMessage(userNames);
		}

		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		String[] recod = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
			"Change uid4567 Ryan"};
		System.out.println(Arrays.toString(s.solution(recod)));
	}

	private class Message {
		private String userId;
		private String event;

		public Message(String userId, String event) {
			this.userId = userId;
			this.event = event;
		}

		public String printMessage(Map<String, String> userNames) {
			String message = userNames.get(userId);
			if ("Enter".equals(event)) {
				message += "님이 들어왔습니다.";
			} else {
				message += "님이 나갔습니다.";
			}
			return message;
		}
	}
}

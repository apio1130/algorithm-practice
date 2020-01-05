package com.algorithm.programmers.lessons42579;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h3>베스트앨범</h3>
 * <h4>문제 설명</h4> 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는
 * 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.<br>
 * <ol>
 * <li>속한 노래가 많이 재생된 장르를 먼저 수록합니다.</li>
 * <li>장르 내에서 많이 재생된 노래를 먼저 수록합니다.</li>
 * <li>장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.</li>
 * </ol>
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈
 * 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.<br>
 * 
 * <h4>제한사항</h4>
 * <ul>
 * <li>genres[i]는 고유번호가 i인 노래의 장르입니다.</li>
 * <li>plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.</li>
 * <li>genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.</li>
 * <li>장르 종류는 100개 미만입니다.</li>
 * <li>장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.</li>
 * <li>모든 장르는 재생된 횟수가 다릅니다.</li>
 * </ul>
 * <h4>입출력 예</h4>
 * <table border="1">
 * <caption>입출력</caption>
 * <tr>
 * <td>genres</td>
 * <td>plays</td>
 * <td>return</td>
 * </tr>
 * <tr>
 * <td>["classic", "pop", "classic", "classic", "pop"]</td>
 * <td>[500, 600, 150, 800, 2500]</td>
 * <td>[4, 1, 3, 0]</td>
 * </tr>
 * </table>
 * <h4>입출력 예 설명</h4> classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.<br>
 * <ul>
 * <li>고유 번호 3: 800회 재생</li>
 * <li>고유 번호 0: 500회 재생</li>
 * <li>고유 번호 2: 150회 재생</li>
 * </ul>
 * pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.<br>
 * <ul>
 * <li>고유 번호 4: 2,500회 재생</li>
 * <li>고유 번호 1: 600회 재생</li>
 * </ul>
 * 따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.<br>
 * 
 */
class Solution {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		
		Map<String, Integer> totalPlayCntInfo = new LinkedHashMap<>();
		List<PlayInfo> playlist = new ArrayList<>();
		for (int i = 0; i < genres.length; i++) {
			playlist.add(new PlayInfo(i, genres[i], plays[i]));
			totalPlayCntInfo.put(genres[i], (totalPlayCntInfo.getOrDefault(genres[i], 0) + plays[i]));
		}
		playlist.sort(Comparator.comparing(PlayInfo::getPlayCount).reversed());
		String[] reversedGenres = totalPlayCntInfo.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
															 .map(Map.Entry::getKey).toArray(String[]::new);
		Supplier<Stream<PlayInfo>> s = playlist::stream;
		List<Integer> ansList = new LinkedList<>();
		for (String g : reversedGenres) {
			ansList.addAll(s.get().filter(p -> g.equals(p.getGenre())).limit(2).map(PlayInfo::getIndex).collect(Collectors.toList()));
		}
		
		answer = ansList.stream().mapToInt(p -> p).toArray();
		return answer;
	}

	private class PlayInfo {
		private Integer index;
		private String genre;
		private Integer playCount;

		public PlayInfo(Integer index, String genre, Integer playCount) {
			this.index = index;
			this.genre = genre;
			this.playCount = playCount;
		}
		
		public Integer getIndex() {
			return index;
		}
		public String getGenre() {
			return genre;
		}
		public Integer getPlayCount() {
			return playCount;
		}

		@Override
		public String toString() {
			return "PlayInfo [index=" + index + ", genre=" + genre + ", playCount=" + playCount + "]";
		}
	}
}

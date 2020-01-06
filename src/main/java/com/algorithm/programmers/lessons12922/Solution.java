package com.algorithm.programmers.lessons12922;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <h3>수박수박수박수박수박수?</3>
 * <h4>문제 설명</h4> 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을
 * 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.<br>
 * 
 * <h4>제한 조건</h4>
 * <ol>
 * <li>n은 길이 10,000이하인 자연수입니다.</li>
 * </ol>
 * <table border="1">
 * <caption>입출력 예</caption>
 * <tr>
 * <td>n</td>
 * <td>return</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td>"수박수"</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td>"수박수박"</td>
 * </tr>
 * </table>
 */
class Solution {
	public String solution(int n) {
		return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());
	}
}

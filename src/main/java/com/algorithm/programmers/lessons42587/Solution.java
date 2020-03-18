package com.algorithm.programmers.lessons42587;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * 프린터
 */
class Solution {

    class Document {
        int index;
        int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Document [index=" + index + ", priority=" + priority + "]";
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Document> documents = new LinkedList<>();
        Document target = null;
        for (int i = 0; i < priorities.length; i++) {
            int priority = priorities[i];
            Document temp = new Document(i, priority);
            documents.add(temp);
            if (location == i) {
                target = temp;
            }
        }

        int[] sortedPriorities = IntStream.of(priorities).map(i -> -i).sorted().map(i -> -i).toArray();
        for (int i = 0; i < sortedPriorities.length; i++) {
            int priority = sortedPriorities[i];
            Document document = null;
            while (true) {
                document = documents.poll();
                if (priority != document.priority) {
                    documents.add(document);
                } else {
                    break;
                }
            }
            if (target.index == document.index) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testCase = { 2, 1, 3, 2 };
//        int[] testCase = { 1, 1, 9, 1, 1, 1 };
        int location = 2;
//        int location = 0;
        int result = solution.solution(testCase, location);
        System.out.println(result);
    }
}

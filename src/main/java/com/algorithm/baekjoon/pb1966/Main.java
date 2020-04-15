package com.algorithm.baekjoon.pb1966;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 프린터 큐
 *
 */
class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int testCaseCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCaseCount; i++) {
            String[] inputNM = sc.nextLine().split(" ");
            int N = Integer.parseInt(inputNM[0]);
            int M = Integer.parseInt(inputNM[1]);
            int[] prioritys = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] orderedPrioritys = Arrays.stream(prioritys).map(p -> p * -1).sorted().map(p -> p * -1).toArray();
            Queue<Document> queue = new LinkedList<>();
            for (int j = 0; j < prioritys.length; j++) {
                queue.add(new Document(j, prioritys[j]));
            }
            int result = 0;
            int currentPriority = 0;
            while (!queue.isEmpty()) {
                Document currDoc = queue.poll();
                if (orderedPrioritys[currentPriority] != currDoc.priority) {
                    queue.add(currDoc);
                } else {
                    result++;
                    currentPriority++;

                    if (M == currDoc.idx) {
                        System.out.println(result);
                        break;
                    }
                }
            }
        }
    }

    static class Document {
        int idx;
        int priority;

        public Document(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }
}

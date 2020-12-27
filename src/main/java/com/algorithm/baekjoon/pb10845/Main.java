package com.algorithm.baekjoon.pb10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * 큐
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cmdCount = Integer.parseInt(br.readLine());
        Queue queue = new Queue();
        for (int i = 0; i < cmdCount; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                int numb = Integer.parseInt(cmd.split(" ")[1]);
                queue.push(numb);
            } else {
                switch (cmd) {
                    case "pop":
                        System.out.println(queue.pop());
                        break;
                    case "size":
                        System.out.println(queue.size());
                        break;
                    case "empty":
                        System.out.println(queue.empty());
                        break;
                    case "front":
                        System.out.println(queue.front());
                        break;
                    case "back":
                        System.out.println(queue.back());
                        break;
                }
            }
        }

    }

    private static class Queue {
        private List<Integer> dataList;

        public Queue() {
            this.dataList = new LinkedList<>();
        }

        public void push(int numb) {
            dataList.add(numb);
        }

        public int pop() {
            if (dataList.isEmpty()) {
                return -1;
            }
            return dataList.remove(0);
        }

        public int size() {
            return dataList.size();
        }

        public int empty() {
            return dataList.isEmpty() ? 1 : 0;
        }

        public int front() {
            if (dataList.isEmpty()) {
                return -1;
            }
            return dataList.get(0);
        }

        public int back() {
            if (dataList.isEmpty()) {
                return -1;
            }
            return dataList.get(dataList.size() - 1);
        }
    }
}

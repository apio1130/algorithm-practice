package com.algorithm.programmers.lessons42583;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  다리를 지나는 트럭
 */
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            trucks.add(truck_weights[i]);
        }

        Queue<Integer> bridge = new LinkedList<>();
        int currentWeight = 0;
        int truck = 0;
        do {
            // push 트럭
            if (trucks.isEmpty()) {
                answer+= bridge_length;
                break;
            }
            
            answer++;
            int temp = trucks.peek();
            if (currentWeight + temp <= weight) {
                truck = trucks.poll();
                bridge.add(truck);
                currentWeight += truck; 
            } else {
                bridge.add(0);
            }
            
            // pop 트럭
            if (bridge.size() == bridge_length) {
                int finish = bridge.poll();
                currentWeight -= finish; 
            }
        } while (!bridge.isEmpty());

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // case.1
//        int bridge_length = 2;
//        int weight = 10;
//        int[] truck_weights = { 7, 4, 5, 6 };
        // case.2
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

        int result = solution.solution(bridge_length, weight, truck_weights);
        System.out.println(result);
    }
}

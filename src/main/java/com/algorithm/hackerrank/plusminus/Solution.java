package com.algorithm.hackerrank.plusminus;
import java.util.Scanner;

class Solution {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int arrLength = arr.length;
    	int positiveNumbCnt = 0;
    	int negativeNumbCnt = 0;
    	int zerosCnt = 0;
    	
    	for (int i : arr) {
    		if (i > 0) {
    			positiveNumbCnt++;
    		} else if (i < 0) {
    			negativeNumbCnt++;
    		} else {
    			zerosCnt++;
    		}
		}
    	
    	System.out.printf("%5f\n", ((double) positiveNumbCnt) / arrLength);
    	System.out.printf("%5f\n", ((double) negativeNumbCnt) / arrLength);
    	System.out.printf("%5f\n", ((double) zerosCnt) / arrLength);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

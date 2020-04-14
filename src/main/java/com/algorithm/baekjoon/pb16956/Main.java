package com.algorithm.baekjoon.pb16956;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 늑대와 양(<a href="https://www.acmicpc.net/problem/16956">link</a>)
 *
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] pastureSize = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] pastureArr = new char[pastureSize[0]][pastureSize[1]];
        for (int i = 0; i < pastureArr.length; i++) {
            pastureArr[i] = reader.readLine().toCharArray();
        }
        reader.close();
        for (int i = 0; i < pastureArr.length; i++) {
            for (int j = 0; j < pastureArr[i].length; j++) {
                if (pastureArr[i][j] == 'S') {
                    setFence(pastureArr, i, j);
                }
            }
        }

        boolean isBlockWolf = checkSafe(pastureArr);
        if (isBlockWolf) {
            System.out.println("1");
            print(pastureArr);
        } else {
            System.out.println("0");
        }
    }

    private static boolean checkSafe(char[][] pastureArr) {
        for (int i = 0; i < pastureArr.length; i++) {
            for (int j = 0; j < pastureArr[i].length; j++) {
                char curs = pastureArr[i][j];
                if (curs == 'S' && !blockWolf(pastureArr, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void setFence(char[][] pastureArr, int x, int y) {
        int xMaxVal = pastureArr.length;
        int yMaxVal = pastureArr[x].length;
        int[] xa = { -1, 0, 1, 0 };
        int[] ya = { 0, 1, 0, -1 };
        for (int i = 0; i < 4; i++) {
            int ix = x + xa[i];
            int iy = y + ya[i];
            if (ix > -1 && iy > -1 && ix < xMaxVal && iy < yMaxVal) {
                char curs = pastureArr[ix][iy];
                if ('.' == curs) {
                    pastureArr[ix][iy] = 'D';
                }
            }
        }
    }

    private static void print(char[][] pastureArr) {
        for (int i = 0; i < pastureArr.length; i++) {
            for (int j = 0; j < pastureArr[i].length; j++) {
                System.out.print(pastureArr[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean blockWolf(char[][] pastureArr, int x, int y) {
        int xMaxVal = pastureArr.length;
        int yMaxVal = pastureArr[x].length;
        int[] xa = { -1, 0, 1, 0 };
        int[] ya = { 0, 1, 0, -1 };

        for (int i = 0; i < 4; i++) {
            int ix = x + xa[i];
            int iy = y + ya[i];
            if (ix > -1 && iy > -1 && ix < xMaxVal && iy < yMaxVal) {
                char curs = pastureArr[ix][iy];
                if ('W' == curs) {
                    return false;
                }
            }
        }
        return true;
    }

}

package com.algorithm.hackerrank.timeconversion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Time Conversion
 * 
 */
class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String condition = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        String[] timeArr = time.split(":");

        int hour = Integer.parseInt(timeArr[0]);

        if ("PM".equals(condition) && hour < 12) {
            timeArr[0] = String.valueOf(hour + 12);
        }
        if ("AM".equals(condition) && hour == 12) {
            timeArr[0] = "00";
        }

        return String.join(":", timeArr);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

package com.leetcode;

import java.util.*;

public class Google {
    public static long[][] solve(int Q, long[] queries) {
        long[][] result = new long[Q][2];
        for (int i = 0; i < Q; i++) {
            long N = queries[i];
            
            // Number of '1's is the count of perfect squares up to N
            long countOnes = (long) Math.sqrt(N);
            long countZeros = N - countOnes;
            
            // Store the results in the array
            result[i][0] = countZeros;
            result[i][1] = countOnes;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int Q = sc.nextInt();
            long[] queries = new long[Q];
            for (int i = 0; i < Q; i++) {
                queries[i] = sc.nextLong();
            }
            long[][] output = solve(Q, queries);
            for (long[] res : output) {
                System.out.println(res[0] + " " + res[1]);
            }
        }
        sc.close();
    }
}

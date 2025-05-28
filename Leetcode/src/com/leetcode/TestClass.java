package com.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        // Read the number of test cases
        int T = Integer.parseInt(br.readLine().trim());

        for (int t_i = 0; t_i < T; t_i++) {
            // Read the number of queries
            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_Query = br.readLine().split(" ");

            long[] Query = new long[Q];

            // Parse the queries into a long array
            for (int i_Query = 0; i_Query < arr_Query.length; i_Query++) {
                Query[i_Query] = Long.parseLong(arr_Query[i_Query]);
            }

            // Call the solve function
            long[][] out = solve(Q, Query);

            // Print the output
            for (int i_out_ = 0; i_out_ < out.length; i_out_++) {
                System.out.print(out[i_out_][0]);
                for (int j_out_ = 1; j_out_ < out[i_out_].length; j_out_++) {
                    System.out.print(" " + out[i_out_][j_out_]);
                }
               if(i_out_ != out.length-1) System.out.println();
            }
        }
        wr.close();
        
    }

    // Example implementation of the solve function
    // Replace with your logic
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
}

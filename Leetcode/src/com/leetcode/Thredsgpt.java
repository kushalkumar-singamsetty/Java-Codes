package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Thredsgpt {

    public static int[] exclusiveTime(int n, String[] logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTimestamp = 0;
        for (String log : logs) {
            String[] logParts = log.split(":");
            int functionId = Integer.parseInt(logParts[0]);
            String action = logParts[1];
            int timestamp = Integer.parseInt(logParts[2]);
            if (action.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timestamp - prevTimestamp;
                }
                stack.push(functionId);
                prevTimestamp = timestamp;
            } else {
                result[stack.pop()] += timestamp - prevTimestamp + 1;
                prevTimestamp = timestamp + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] logs = {"0:start:0","1:start:2","1:end:5","2:start:6","2:end:9","0:end:12"};
        int[] arr = exclusiveTime(n, logs);
        System.out.println(Arrays.toString(arr));
    }
}


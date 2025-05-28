package com.leetcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int result = maxLengthOfPrefix(S);
        System.out.println(result);
    }

    public static int maxLengthOfPrefix(String S) {
        int maxLength = 0;
        for (int i = 1; i <= S.length() / 2; i++) {
            String prefix = S.substring(0, i);
            Pattern pattern = Pattern.compile(prefix);
            Matcher matcher = pattern.matcher(S);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (count >= 2 && prefix.length() > maxLength) {
                maxLength = prefix.length();
            }
        }
        return maxLength;
    }
}

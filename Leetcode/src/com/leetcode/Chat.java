package com.leetcode;

import java.util.*;

public class Chat {
    public static List<String> getLatestKRequests(String[] requests, int k) {
        List<String> result = new ArrayList<>();
        Set<String> seenRequests = new HashSet<>();
        
        for (int i = requests.length - 1; i >= 0 && result.size() < k; i--) {
            String currentRequest = requests[i];
            if (!seenRequests.contains(currentRequest)) {
                result.add(currentRequest);
                seenRequests.add(currentRequest);
            }
        }
        
//        Collections.reverse(result); // Reverse the list to get the correct order
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        String[] requests1 = {"item1", "item2", "item3", "item1", "item3"};
        int k1 = 3;
        System.out.println(getLatestKRequests(requests1, k1));

        String[] requests2 = {"item1"};
        int k2 = 1;
        System.out.println(getLatestKRequests(requests2, k2));
    }
}
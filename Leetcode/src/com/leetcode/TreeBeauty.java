package com.leetcode;
import java.util.*;
import java.util.Arrays;

public class TreeBeauty {

    static class TreeNode {
        int value;
        List<TreeNode> children;

        TreeNode(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        TreeNode[] nodes = new TreeNode[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new TreeNode(A[i]);
        }

        for (int i = 1; i < N; i++) {
            nodes[P[i]].children.add(nodes[i]);
        }

        List<List<Integer>> allPaths = new ArrayList<>();
        dfs(nodes[0], new ArrayList<>(), allPaths);

        int maxBeauty = 1;
        for (List<Integer> path : allPaths) {
            maxBeauty = Math.max(maxBeauty, longestGCDSubsequence(path));
        }

        System.out.println(maxBeauty);
    }

    private static void dfs(TreeNode node, List<Integer> currentPath, List<List<Integer>> allPaths) {
        currentPath.add(node.value);
        allPaths.add(new ArrayList<>(currentPath));

        for (TreeNode child : node.children) {
            dfs(child, currentPath, allPaths);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int longestGCDSubsequence(List<Integer> path) {
        int n = path.size();
        if (n == 1) return 1;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (gcd(path.get(i), path.get(j)) > 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }

        return maxLength;
    }
}
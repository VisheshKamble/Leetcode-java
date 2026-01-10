package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int operations = 0;

        // Count frequency of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Try to form pairs
        for (int num : freq.keySet()) {
            int complement = k - num;

            // Skip if we've already used this number or complement
            if (!freq.containsKey(num)) continue;

            if (num == complement) {
                // Case: 2 same numbers (like 3+3=6)
                operations += freq.get(num) / 2;
                freq.put(num, 0); // mark as used
            } else if (freq.containsKey(complement)) {
                // Case: different numbers (like 1+4=5)
                int pairs = Math.min(freq.get(num), freq.get(complement));
                operations += pairs;

                // Reduce counts
                freq.put(num, freq.get(num) - pairs);
                freq.put(complement, freq.get(complement) - pairs);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        MaxNumberofKSumPairs solution = new MaxNumberofKSumPairs();

        int[][] testArrays = {
                {1, 2, 3, 4},           // k=5 → 2
                {3, 1, 3, 4, 3},        // k=6 → 1
                {4, 4, 1, 3, 1, 5},     // k=5 → 2
                {2, 5, 4, 4, 1, 3, 4},  // k=7 → 3
                {1},                    // k=1  → 0
                {3, 3, 3, 3}            // k=6  → 2
        };

        int[] ks = {5, 6, 5, 7, 1, 6};

        for (int i = 0; i < testArrays.length; i++) {
            int result = solution.maxOperations(testArrays[i], ks[i]);
            System.out.printf("nums = %-25s  k = %d  →  %d operations%n",
                    java.util.Arrays.toString(testArrays[i]), ks[i], result);
        }
    }
}
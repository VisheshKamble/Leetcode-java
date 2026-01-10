package LeetCode75;

public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;   // smallest number in potential triplet
        int second = Integer.MAX_VALUE;  // second smallest

        for (int num : nums) {
            if (num <= first) {
                first = num;             // found a better (smaller) starting point
            }
            else if (num <= second) {
                second = num;            // found a better middle candidate
            }
            else {
                // num > second → we have first < second < num
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        // Test cases
        int[][] tests = {
                {1, 2, 3, 4, 5},           // true
                {5, 4, 3, 2, 1},           // false
                {2, 1, 5, 0, 4, 6},        // true
                {1, 1, 1, 1},              // false
                {20, 10, 30, 15, 25, 40},  // true
                {1, 5, 2, 4, 3},           // true
                {2147483647, 2147483646, 2147483647}  // true
        };

        for (int[] arr : tests) {
            System.out.printf("Array: %s → %b%n",
                    java.util.Arrays.toString(arr),
                    increasingTriplet(arr));
        }
    }
}
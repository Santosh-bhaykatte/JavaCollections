package javaCollections.programs;

public class MaxSubarraySum1 {
    static void maxSubarraySum(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        if (arr.length == 1) {
            System.out.println("Max subarray sum: "+ arr[0]);
            return;
        }

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            int currSum = 0;
            for (int j = i; j < n; ++j) {
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println("Max subarray sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-5, -2, 1, 2, 3};
        maxSubarraySum(arr);
    }
}

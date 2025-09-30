package javaCollections.programs;

public class MaxSubarraySum2 {
    static void maxSubarraySumKadaneAlgo(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        if (arr.length == 1) {
            System.out.println("Max subarray sum: "+ arr[0]);
            return;
        }
        int n = arr.length;

        //Intially handle all -ve values
        int maxNeg = Integer.MIN_VALUE;
        int j = 0;
        /*
        for (j = 0; j < n; ++j) {
            if (!(arr[j] > 0)) {
                maxNeg = Math.max(arr[j], maxNeg);
                continue;
            }
            break;
        }*/
        while (j < arr.length && arr[j] < 0) {
            maxNeg = Math.max(arr[j], maxNeg);
            j++;
        }
        if (j == arr.length) {
            System.out.println("Max subarray sum: "+ maxNeg);
            return;
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; ++i) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max subarray sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-7, -5, -1, -4, -2};
        maxSubarraySumKadaneAlgo(arr);
    }
}

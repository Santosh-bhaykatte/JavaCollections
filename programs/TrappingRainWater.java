package javaCollections.programs;

public class TrappingRainWater {
    static int trappedRainWater(int[] height) {
        int n = height.length;

        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];

        //Calculate leftMaxBoundary
        int leftMax = Integer.MIN_VALUE;
        for (int i = 0; i < leftMaxBoundary.length; ++i) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
            leftMaxBoundary[i] = leftMax;
        }

        //Calculate rightMax
        int rightMax = Integer.MIN_VALUE;
        for (int i = rightMaxBoundary.length-1; i >= 0; --i) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            }
            rightMaxBoundary[i] = rightMax;
        }

        //Calculate Trapped water
        int waterTrapped = 0;
        for (int i = 0; i < n; ++i) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            waterTrapped += (waterLevel - height[i]);
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Water: "+ trappedRainWater(height) +" units");
    }
}

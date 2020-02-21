package Leetcode.Array;

public class TrappingRainWater_42 {
    public int trap1(int[] height) {

        return 0;

    }

    // 3 Array
    public int trap(int[] height) {
        int ls = height.length;
        if(height == null || ls < 3) return 0;

        // Initial 3 array, save max height
        int[] left = new int[ls];
        int[] right = new int[ls];
        int[] res = new int[ls];

        int max_left = 0, max_right = 0;

        // Find max_left height for all column
        for (int i = 0; i < ls - 1; i++){
            max_left = Math.max(max_left, height[i]);
            left[i] = max_left;
        }

        // Find max_right height for all column
        for (int i = ls - 1; i > - 1; i--) {
            max_right = Math.max(height[i], max_right);
            right[i] = max_right;
        }

        // Find each height for all column
        for (int i = 0; i < ls - 1; i++) {
            int h = Math.min(left[i], right[i]);
            if(height[i] < h){ res[i] = h - height[i]; }
        }

        // Get sum of all water column

        int water =  0;
        for (int i = 0; i < ls; i++)  water += res[i];
        return water;
    }
}

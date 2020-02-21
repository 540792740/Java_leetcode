package Leetcode.Array;
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max_Area = 0;

        while (left < right) {
            max_Area = Math.max(max_Area,
                    Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_Area;
    }
}

package Leetcode.Array;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[++m] = nums[i];
        return m;
    }
}
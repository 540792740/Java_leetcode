package Leetcode.Array;

public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
    public int removeDuplicates1(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[ i - 1])
                nums[i++] = n;
        return i;
    }
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int tail = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[tail])
                nums[++tail] = nums[i];
        return tail + 1;
    }
}










//public class test {
//    public static void main(String[] args) {
//        RemoveDuplicatesfromSortedArray_26 A = new RemoveDuplicatesfromSortedArray_26();
//        int a = A.removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]);
//        System.out.println(a);
//    }
//}
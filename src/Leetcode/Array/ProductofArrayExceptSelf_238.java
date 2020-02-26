package Leetcode.Array;

public class ProductofArrayExceptSelf_238 {
    public static int[] productExceptSelf(int[] nums) {
        int ls =  nums.length;
        int temp = 1;
        int res[] = new int[ls];

        for(int i = 0; i < ls; i++){
            res[i] =  temp;
            temp *= nums[i];
        }

        temp = 1;
        for(int j = ls - 1; j > -1; j--){
            res[j] *= temp;
            temp *= nums[j];
        }
        return res;
    }
    public static void main(String[] args){
        int[] a = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}

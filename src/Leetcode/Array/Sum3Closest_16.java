package Leetcode.Array;

import java.lang.annotation.Target;
import java.util.Arrays;

public class Sum3Closest_16 {
    public static int threeSumClosest(int[] nums, int target) {
        int ls = nums.length;
        if(ls < 3){return 0;}
        int temp, left, right;
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < ls - 2; i++){
            left = i + 1;
            right = ls - 1;
            while(left < right){
                temp = nums[i] + nums[left] + nums[right];
                // when 3sum is target, return target
                if (temp == target){return target;}

                // update closest 3sum
                if(Math.abs(temp - target) < Math.abs(res - target)){res = temp;
                System.out.println(res);}

                if(temp > target){right--; }
                else if(temp < target){ left++; }
                else{break;}
            }
        }
        return res;
    }
    public static void main(String[] args){
        int a = threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82);
        System.out.println(a);
    }
}


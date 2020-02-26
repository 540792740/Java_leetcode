package Leetcode.Array;

import java.util.HashMap;
import java.util.Hashtable;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int res = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (h1.containsKey(nums[i])) {
                h1.put(nums[i], h1.get(nums[i]) + 1);
            } else {
                h1.put(nums[i], 1);
            }

            if (h1.get(nums[i]) > (nums.length) / 2) {
                res = nums[i];
                break;
            }
        }
        return res;
    }

    public int majorityElement1(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }
            if (nums[i] != res) {
                count--;
            } else {
                count++;
            }
        }
        return res;
    }
}

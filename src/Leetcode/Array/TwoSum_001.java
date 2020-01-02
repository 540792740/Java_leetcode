package Leetcode.Array;
import java.util.*;

public class TwoSum_001 {
    public static int[] twosum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer diff = (target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }
    public static void main(String[] args){
        int[] nums ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twosum(nums, target)));

        for(int i = 0; i <= 3; i++){
            char ch = 'a';
            char print = ch;
            for (int j =  0; j <= i; j++){
                System.out.print((print++));
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++)
            System.out.println("cute");
            System.out.println("kk");
        int i = 0;
        if (i == 0)
            System.out.println("i == 0");
    }
}

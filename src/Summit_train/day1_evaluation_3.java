package Summit_train;

import java.util.ArrayList;
import java.util.List;

public class day1_evaluation_3 {
    private List<String> Popping_blocks(String[] arr) {
        int ls = arr.length;
        List<String> a = new ArrayList<String>();
        for (int i = 0; i < ls; i++){
            a.add(arr[i]);
        }
        return helper(a);
    }

    private List<String> helper(List<String> arr){
        int ls = arr.size();
        if (ls <= 1){return arr;}
        String temp_string = arr.get(0);
        int count = 1;
        for (int i = 1; i < ls; i++) {
            if (temp_string.equals(arr.get(i))) {
                int j = i;
                while (j < ls && temp_string.equals(arr.get(j))) {
                    count += 1;
                    j++;
                }
                while (count > 0){
                    arr.remove(i - 1);
                    count--;
                }
                return helper(arr);
            }
            else{
                count = 1;
                temp_string = arr.get(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        day1_evaluation_3 d3 = new day1_evaluation_3();
        String[] arr = {"D","A", "B"};
        String[] arr1 = {"D", "D","A", "A","B", "B", "A", "B", "B"};
        String[] arr2 = {"D", "D", "D", "D"};
        String[] arr3 = {};
        System.out.println(d3.Popping_blocks(arr));
        System.out.println(d3.Popping_blocks(arr1));
        System.out.println(d3.Popping_blocks(arr2));
        System.out.println(d3.Popping_blocks(arr3));

    }
}
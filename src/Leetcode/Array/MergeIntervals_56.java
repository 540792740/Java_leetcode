package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals_56 {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length < 2 || intervals[0].length == 0){return intervals;}

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        // New res
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length - 1; i++){
            if(intervals[i][1] >= intervals[i + 1][0]){
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i + 1][1], intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }
        }

        // Add last interval
        res.add(intervals[intervals.length - 1]);
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args){
        int [][] interval = {{1, 3}, {2, 6},{8, 10}};
        System.out.println(merge(interval));

    }

}

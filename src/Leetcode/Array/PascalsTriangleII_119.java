package Leetcode.Array;
import java.util.*;

public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++){
            for (int j = i - 1; j >= 1; j--){
                int temp = row.get(j - 1) + row.get(j);
                row.set(j, temp);
            }
            row.add(1);
        }
       return row;
    }
}

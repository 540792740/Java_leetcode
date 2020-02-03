package Summit_train;

import java.util.HashSet;

public class day1_evaluation_2 {
    private String Shir_Game(String[] arr){
        HashSet set = new HashSet();
        int ls = arr.length;
        if (ls == 0){return "Nothing Input";}
        String last_end = "" + arr[0].charAt(0);
        for (int i = 0; i < ls; i++){
            if (last_end.equals("" + arr[i].charAt(0))){
                last_end = "" + arr[i].charAt(arr[i].length() - 1);
            }
            else{
                return "Invalid! - " + arr[i] + " should start with " + arr[i].charAt(0);
            }
            if (set.contains(arr[i])){ return "Invalid! - " + arr[i] + " has already been said";}

            set.add(arr[i]);
        }
        return "Valid";
    }

    public static void main(String[] args){
        day1_evaluation_2 d2 = new day1_evaluation_2();
        String[] input = {"word", "doy", "yol", "leader"};
        String[] input1 = {"Motive", "Beach"};
        String[] input2 = {"hive", "eh", "hive"};
        System.out.println(d2.Shir_Game(input));
        System.out.println(d2.Shir_Game(input1));
        System.out.println(d2.Shir_Game(input2));
    }


}

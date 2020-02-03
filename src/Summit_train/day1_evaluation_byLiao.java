package Summit_train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day1_evaluation_byLiao {
    public List<Integer> min_coin(int[] coins, int target){
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(coins);
        return dfs(l1, target, coins);
    }

    private List<Integer> dfs(List<Integer> path, int target, int[] coins){
        if (target == 0){
            return path;
        }
        else if(target < 0){ return null;}
        else{
            for(int i = coins.length - 1; i >= 0; i--){
                path.add(coins[i]);
                if (dfs(path, target - coins[i], coins) != null){
                    return path;
                }
                path.remove(path.size() - 1);
                }
            return null;
            }
        }
    }

class TestCoins{
    public static void main(String[] args) {
        int[] coins = new int[]{ 5, 10};
        int target = 13;
        day1_evaluation_byLiao test = new day1_evaluation_byLiao();
        List<Integer> l1 = test.min_coin(coins, target);
        if (l1 == null){System.out.println("Cannot ouput");}
        else {
            for (int i = 0; i < l1.size(); i++) {
                System.out.println(l1.get(i));
            }
        }

//        System.out.println("--------------------------");
//        target = 47;
//        res = test.minCoin(coins, target);
//        for(int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i));
//        }
    }
}

package Summit_train;

import java.util.ArrayList;
import java.util.List;

public class day1_evaluation_1 {
    private String sex_Cycle(int number){
//        Get branch in 12 different choice
        List<String> branch = new ArrayList<String>();
        branch.add("Monkey");
        branch.add("Rooster");
        branch.add("Dog");
        branch.add("Pig");
        branch.add("Rat");
        branch.add("Ox");
        branch.add("Tiger");
        branch.add("Rabbit");
        branch.add("Dragon");
        branch.add("Snake");
        branch.add("Horse");
        branch.add("Sheep");
        int temp_branch = number % 12;

//        Get stem in 10 different choice
        List<String> Stem = new ArrayList<String>();
        Stem.add("Metal");
        Stem.add("Metal");
        Stem.add("Water");
        Stem.add("Water");
        Stem.add("Wood");
        Stem.add("Wood");
        Stem.add("Fire");
        Stem.add("Fire");
        Stem.add("Earth");
        Stem.add("Earth");
        int temp_Stem = number % 10;

        return Stem.get(temp_Stem) + " " + branch.get(temp_branch) ;
    }
    public static void main(String[] args){
        day1_evaluation_1 d1 = new day1_evaluation_1();
        String a = d1.sex_Cycle(1984);
        String b = d1.sex_Cycle(1927);
        String c = d1.sex_Cycle(1974);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

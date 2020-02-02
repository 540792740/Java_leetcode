package Summit_train;
/*
*  Assignment 2
*  String: length()
*  list, array_list: size
* Math.random()  -> [0, 1)
*/
import java.util.HashSet;
import java.util.Scanner;

public class day1_oop {
    private void get_lottery(){

        System.out.print("Please Input a number of your lottery: ");
        Scanner s2 = new Scanner(System.in);
        int number = s2.nextInt();
        int lottery = (int)(Math.random() * 1000);
        System.out.println("The lottery is $" + lottery);
        System.out.println("Your lottery number is $" + number);

        if(number == lottery){
            System.out.println("You Win $10,000");
        }

        // Number of lottery
        int l1 = lottery / 100;
        int l2 = (lottery % 100) / 10;
        int l3 = (lottery %  10);

        // Your lottery number
        int n1 = number / 100;
        int n2 = (number % 100) / 10;
        int n3 = (number %  10);

        HashSet<Integer> set = new HashSet<>();
        set.add(l1);
        set.add(l3);
        set.add(l2);

        if (set.contains(n1) && set.contains(n2) && set.contains(n3)){
            System.out.println("You Win $3,000");
        }
        else if(set.contains(n1) || set.contains(n2) || set.contains(n3)){
            System.out.println("You Win $1,000");
        }
        else{
            System.out.println("Your win Nothing");
        }

        s2.close();

    }
    public static void main(String[] args) {

        System.out.println("Enter employee's name:");
        Scanner s = new Scanner(System.in);
        System.out.println(s.next());

        day1_oop d1 = new day1_oop();
        d1.get_lottery();
        s.close();




    }


}

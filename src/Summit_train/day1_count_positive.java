package Summit_train;
/*
Count positive and negative numbers and compute the average of numbers
Your program ends with the input 0.
Enter an integer, the input ends if it is 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5
The average is 1.25
*/
import java.util.Scanner;

public class day1_count_positive {
    public void get_number() {
        System.out.println("Input a series of number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 0) {
            System.out.println("End with input 0");
            return;
        }

        int positive = 0, negative = 0, sum = 0, count = 0;
        while (num != 0){
            if (num > 0) positive++;
            else negative++;
            sum += num;
            count += 1;
            num = s.nextInt();

        }
        float ave = (float)sum / (float)count;
        System.out.print("ave: " + ave + "sum" + sum);
        s.close();
    }
    public static void main(String[] args){
        day1_count_positive d1 = new day1_count_positive();
        d1.get_number();

    }
}

package Summit_train;
import java.util.Random;
/*
* Author: Jiawei Wang
*
* */


public class day7_Assignment {
    int generate_number;
    public static void main(String[] args){
        day7_Assignment d1 = new day7_Assignment();
        thread1 t_1 = new thread1();
        Thread  t1 = new Thread(t_1);

        thread2  t_2 = new thread2();
        Thread  t2 = new Thread(t_2);

        thread3  t_3 = new thread3();
        Thread  t3 = new Thread(t_3);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t_2.set_num(t_1.get_num());

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t_3.set_num(t_1.get_num());
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class thread1 extends day7_Assignment implements Runnable{
//    int generate_number;
    public void run() {
        Random r = new Random();
        int number = r.nextInt(100);
        generate_number = number;
//        System.out.println(generate_number);
//        System.out.println(Math.pow(generate_number, 2));
        generate_number = 8;
    }
    public Integer get_num(){return generate_number;}
    public void set_num(int generate_number){this.generate_number = generate_number;}
}
class thread2 extends thread1 implements Runnable{
    public Integer get_num(){return generate_number;}
    public void set_num(int generate_number){this.generate_number = generate_number;}

    public void run() {
//        generate_number is even
        System.out.println(generate_number);
        if (generate_number % 2 == 0) {
            System.out.println(Math.pow(generate_number, 2));
        }
//        generate_number is ood
        else{ return ;}
    }
}
class thread3 extends thread2 implements Runnable{
    public Integer get_num(){return generate_number;}
    public void set_num(int generate_number){this.generate_number = generate_number;}
    public void run() {
        //        generate_number is even
        if (generate_number % 2 == 0){
            System.out.println(Math.pow(generate_number, 3));
        }
//        generate_number is ood
        else{ return ;}
    }
}

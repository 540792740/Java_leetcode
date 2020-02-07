package Summit_train;

//class test{}
class mythread extends Thread{
    // Overwrite run function
    public void run(){System.out.println("Thread overwrite run");}
}

class mythread1 extends test implements Runnable{
    // Overwrite run function
    public void run(){ System.out.println("Thread1 overwrite run");}
}

public class Day7_multiThread {
    public static void main(String[] args){
        System.out.println("First line");
        // Run Thread by using start();
        mythread m = new mythread();
        m.start();
        System.out.println("last line");

        // Interface Thread
        mythread1 m1 = new mythread1();
        Thread t = new Thread(m1);
        t.start();

        // max_priority min_priority


    }
}

package Summit_train;

public class day7_multiThread2 extends Thread{
    public void run(){
        System.out.println("start: " + Thread.currentThread());
    }

    public static void main(String[] args){
        day7_multiThread2 m1 = new day7_multiThread2();
        day7_multiThread2 m2 = new day7_multiThread2();
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m1.start();
        m2.start();
        try {
            // join之后， 先运行m2, 结束之后在往下运行。
            m2.join();
            m1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

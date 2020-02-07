package Summit_train;

public  class day7_synchronization {
    public synchronized void printTable(int n){
        for (int i = 1; i <= 5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args){
        day7_synchronization d1 = new day7_synchronization();
        d1.printTable(6);

    }


}

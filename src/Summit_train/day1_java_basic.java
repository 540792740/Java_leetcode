package Summit_train;

/*
    1. static 可直接变
    2. 非static 的变量或函数，需要先实例化。

*/
public class day1_java_basic {
    private static int do_while() {
        int n = 5;
        do {
            System.out.println("n = " + n);
            n--;
        } while (n > 10);

        n = 5;
        while (n > 0) {
            System.out.println("n = " + n);
            n--;
        }
        return 0;
    }

    private String square(int a) {
        return "" + a + " " + a * a;
    }

    public static void main(String[] args){
        int a = do_while();
        day1_java_basic.do_while();
        day1_java_basic day1 = new day1_java_basic();
        System.out.println(day1.square(2));
    }
}
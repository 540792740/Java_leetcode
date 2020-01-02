package JavaCourse;

public class OverLoad_demo1 {
    public static void main(String[] args){
        System.out.print("Two byte :");
        byte a = 10;
        byte b = 10;
        System.out.println(isSame(a, b));

        System.out.print("Two short :");
        System.out.println(isSame((short)a, (short)b));

        System.out.print("Two int : ");
        System.out.println(isSame(10, 20));

        System.out.print("Two long : ");
        System.out.println(isSame(10L, 20L));

    }

    public static boolean isSame(byte a, byte b){
        boolean same;
        if (a == b){
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b){
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b){
        return a == b;
    }

    public static boolean isSame(long a, long b){
        if (a == b) {
            return true;
        } else {
            return false;
        }

    }

}

package JavaCourse;

public class OverLoad_demo {
    public static void main(String[] args){
        System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10, 20, 30));
    }

    public static int sumTwo(int a, int b){
        return a + b;
    }
    public static int sumThree(int a, int b, int c){
        return a + b + c;
    }
    public static double sumTwo(double a, double b){
        return a + b;
    }
    public static float sumTwo(float a, float b){
        return a + b;
    }
}

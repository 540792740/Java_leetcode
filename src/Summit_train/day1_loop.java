package Summit_train;

public class day1_loop {
    public static void main(String[] args){
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int k = i; k < 7; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

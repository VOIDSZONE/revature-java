import java.util.*;

public class P4 {
    private static Scanner sc = new Scanner(System.in);

    public static void getAverage(){
        float sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += sc.nextFloat();
        }

        System.out.println(sum/10);
    }

    public static void main(String[] args) {
        
        getAverage();

        sc.close();
    }
}

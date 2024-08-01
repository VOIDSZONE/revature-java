import java.util.*;

public class Question4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sci = sc.nextInt();
        int maths = sc.nextInt();
        int eng = sc.nextInt();

        System.out.println("Total: " + (sci + maths + eng));
        System.out.println("Percentage: " + ((sci+maths+eng)/3));

        sc.close();
    }

}

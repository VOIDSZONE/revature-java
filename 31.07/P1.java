import java.util.*;

public class P1{

    public static void isSquare(int l, int b){
        if(l == b){
            System.out.println("It is a square");
        }else{
            System.out.println("Not a Square");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int b = sc.nextInt();

        isSquare(l, b);

        sc.close();
    }
}
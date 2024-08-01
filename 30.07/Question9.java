import java.util.*;

public class Question9 {

    public static void sumOf3Digit(int num){
        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;
        
        System.out.println("Sum: " + first + second + third);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        
        sumOf3Digit(num);
        
        sc.close();
    
    }
}

import java.util.*;

public class Question10 {

    public static void reverse(int num){
        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;
       
        System.out.println("Reversed number: " + ((third * 100) + (second * 10) + first));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        
        reverse(number);
    
        sc.close();
    }
}

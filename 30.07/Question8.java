import java.util.*;

public class Question8 {

    public static void sumFirstAndLast(int num){
        int first = num / 10000;
        int secondLast = (num / 10) % 10;
      
        System.out.println("Sum: " + first + secondLast);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();
     
        sumFirstAndLast(num);        
    
        sc.close();
    }
}

import java.util.*;

public class Question6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
    
        System.out.println("Temperature in Celsius: " + (fahrenheit - 32) * 5/9);

        sc.close();
    }
}


import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int product = 1;

        while (true) {

            System.out.println("Enter a number or press q to quit: ");
            String input = sc.next();

            if (input.equals("q")) {
                break;
            }

            int num = Integer.parseInt(input);

            sum += num;
            count++;
            product *= num;
        }

        System.out.println("Average: " + sum/count);
        System.out.println("Product: " + product);

        sc.close();
    }
}


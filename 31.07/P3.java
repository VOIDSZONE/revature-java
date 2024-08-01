import java.util.Scanner;

public class P3 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void hasFullfils(int classes, int attendedClasses, char medical){
        float percent = ((float)attendedClasses/classes) * 100;

        System.out.println("Percentage: " + percent);

        if(percent >=75){
            System.out.println("Y");
        }
        else{
            if(medical == 'y'){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
        
    }
    public static void main(String[] args) {
        
        System.out.println("Number of classes held: ");
        int classes = sc.nextInt();

        System.out.println("Number of classes attended: ");
        int attendedClasses = sc.nextInt();
        
        System.out.println("Has medical cause write y or n: ");
        char medical = sc.next().charAt(0);

        hasFullfils(classes, attendedClasses, medical);

        sc.close();
    }
}

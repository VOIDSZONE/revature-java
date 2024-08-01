public class Question5 {
    
    public static void withTemp(int a, int b){
        int temp = a;
        a = b ;
        b = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    public static void withOutTemp(int a, int b){
        a = a - b;
        b = a + b;
        a = b - a;
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
    
    public static void main(String[] args) {
        int a = 8;
        int b = 6;

        withTemp(a, b);
        withOutTemp(a, b);
    }
}

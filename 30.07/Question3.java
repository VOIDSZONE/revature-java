public class Question3 {
    
    public static int manipulation(int num){
        num += 8;
        num /= 3;
        num %= 5;
        num *=5;

        return num;
    } 
    public static void main(String[] args) {
        
        int result = manipulation(2345);

        System.out.println(result);
    }
}

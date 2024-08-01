public class Question2 {
    
    public static int perimeter(int l, int b, int h){
        return l * b * h;
    }

    public static void main(String[] args) {
        int perimeterOfTriangle = perimeter(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        
        System.out.println("Perimeter: " + perimeterOfTriangle);
    }
}

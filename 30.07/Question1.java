public class Question1{
    public static int area(int l, int w){
        return l * w;
    }

    public static int perimeter(int l, int w){
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        int areaOfRectangle = area(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        int perimeterOfRectangle = perimeter(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("Area " + areaOfRectangle);
        System.out.println("Perimeter " + perimeterOfRectangle);
    }

}
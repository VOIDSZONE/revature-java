public class Question7 {

    public static void gradeCalculation(){
        int totalStudents = 90;
        int totalGradeA = totalStudents / 2;
        int boysGradeA = 20;

        int girlsGradeA = totalGradeA - boysGradeA;
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }

    public static void main(String[] args) {
        gradeCalculation();
    }
}

import java.util.Scanner;

public class Q_10_CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = in.nextInt();
        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the marks of subject " + (i+1) + ": ");
            marks[i] = in.nextInt();
        }
        double[] gpa = new double[subjects];
        double sum = 0;
        for (int i = 0; i < subjects; i++) {
            gpa[i] += (double) (marks[i]) / 10;
            sum += gpa[i];
        }
        System.out.println("CGPA = " + (sum / subjects));
    }
}

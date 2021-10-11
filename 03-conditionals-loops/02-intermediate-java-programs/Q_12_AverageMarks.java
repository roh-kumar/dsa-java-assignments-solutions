import java.util.Scanner;

public class Q_12_AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = in.nextInt();
        double[] marks = new double[n];
        double sum = 0;
        System.out.print("Enter marks in subjects: ");
        for (int i = 0; i < n; i++) {
            marks[i]= in.nextDouble();
            sum = sum + marks[i];
        }
        double average = sum / n;
        System.out.println("The average marks = " + average);
    }
}

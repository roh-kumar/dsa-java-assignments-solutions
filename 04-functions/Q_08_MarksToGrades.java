import java.util.Scanner;

public class Q_08_MarksToGrades {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();
        System.out.println(grade(n));
    }
    static String grade(int n) {
        int[] marks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i+1) + ": ");
            marks[i] = in.nextInt();
            sum += marks[i];
        }
        int avg = sum / n;
        if (avg > 91 && avg <= 100) return "AA";
        if (avg > 81 && avg <= 90) return "AB";
        if (avg > 71 && avg <= 80) return "BB";
        if (avg > 61 && avg <= 70) return "BC";
        if (avg > 51 && avg <= 60) return "CD";
        if (avg > 41 && avg <= 50) return "DD";
        if (avg <= 40) return "Fail";
        return "invalid input";
    }
}

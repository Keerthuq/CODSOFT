import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        final double A_GRADE = 90.0;
        final double B_GRADE = 80.0;
        final double C_GRADE = 70.0;
        final double D_GRADE = 60.0;

       
        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        
        int totalMarks = subject1 + subject2 + subject3;

        
        double averagePercentage = (double) totalMarks / 3;

        char grade;
        if (averagePercentage >= A_GRADE) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE) {
            grade = 'C';
        } else if (averagePercentage >= D_GRADE) {
            grade = 'D';
        } else {
            grade = 'F';
        }

       
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

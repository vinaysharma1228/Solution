package Questions;
import java.util.*;
public class QN5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Determine the grade
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            grade = 'I'; // Invalid score
        }

        // Output the result
        if (grade == 'I') {
            System.out.println("Invalid score entered.");
        } else {
            System.out.println("The grade is: " + grade);
        }

        scanner.close();
    }
}

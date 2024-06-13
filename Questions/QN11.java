package Questions;

import java.util.Scanner;

public class QN11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input the number of terms for Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Print Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");

        int firstTerm = 0, secondTerm = 1;

        // Print the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Compute and print the remaining terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close();
    }
}

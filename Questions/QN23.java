package Questions;

import java.util.Scanner;

public class QN23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        // Validate input
        if (N <= 0) {
            System.out.println("N should be a positive integer.");
        } else {
            // Calculate sum of N natural numbers using non-recursive method
            int sumNonRecursive = calculateSumNonRecursive(N);

            // Calculate sum of N natural numbers using recursive method
            int sumRecursive = calculateSumRecursive(N);

            // Output the sums
            System.out.println("Sum of first " + N + " natural numbers (non-recursive): " + sumNonRecursive);
            System.out.println("Sum of first " + N + " natural numbers (recursive): " + sumRecursive);
        }

        scanner.close();
    }

    // Non-recursive method to calculate sum of N natural numbers
    public static int calculateSumNonRecursive(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    // Recursive method to calculate sum of N natural numbers
    public static int calculateSumRecursive(int N) {
        // Base case: sum of first natural number is 1
        if (N == 1) {
            return 1;
        }
        // Recursive case: sum of first N natural numbers is N + sum of first (N-1) natural numbers
        return N + calculateSumRecursive(N - 1);
    }
}

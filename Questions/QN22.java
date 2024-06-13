package Questions;

import java.util.Scanner;

public class QN22 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        // Validate input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using recursion
            long factorial = computeFactorial(num);

            // Output the factorial
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }

    // Recursive function to compute factorial
    public static long computeFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * computeFactorial(n - 1);
    }
}

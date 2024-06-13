package Questions;

import java.util.Scanner;

public class QN19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Strong Number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }

        scanner.close();
    }

    // Function to calculate the factorial of a number
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a Strong Number
    public static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        // Calculate the sum of factorials of digits
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Check if sum equals the original number
        return sum == originalNumber;
    }
}

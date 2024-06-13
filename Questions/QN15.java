package Questions;

import java.util.Scanner;

public class QN15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digitCount = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return originalNumber == sum;
    }
}

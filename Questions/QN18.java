package Questions;

import java.util.Scanner;

public class QN18 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Perfect Number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }

    // Function to check if a number is a Perfect Number
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a divisor

        // Find all divisors and sum them
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        // Check if the sum of divisors equals the number itself
        return sum == num;
    }
}

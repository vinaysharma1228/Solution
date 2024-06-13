package Questions;

import java.util.Scanner;

public class QN14 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverse(number);

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    // Function to reverse a number
    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return reversed;
    }
}

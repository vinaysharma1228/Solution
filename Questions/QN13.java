package Questions;

import java.util.Scanner;

public class QN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        // Reverse the number
        while (num > 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num = num / 10;
        }

        // Check if originalNumber is equal to reversedNumber
        return originalNumber == reversedNumber;
    }
}

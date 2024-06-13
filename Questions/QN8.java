package Questions;

import java.util.Scanner;

public class QN8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Remove any non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        boolean isPalindrome = true;
        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }

        scanner.close();
    }
}

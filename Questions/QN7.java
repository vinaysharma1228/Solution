package Questions;

import java.util.Scanner;

public class QN7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 5 and 11
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }

        scanner.close();
    }
}

package Questions;

import java.util.Scanner;

public class QN10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input four numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        // Determine the smallest number
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }

        // Output the result
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}

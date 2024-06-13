package Questions;

import java.util.Scanner;

public class QN24 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping (using third variable):");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping (without using third variable):");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}

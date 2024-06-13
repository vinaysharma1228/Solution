package Questions;

import java.util.Scanner;

public class QN12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Print 'Hello'");
        System.out.println("2. Print 'Goodbye'");
        System.out.println("3. Print 'Good morning'");
        System.out.print("Enter your choice (1, 2, or 3): ");
        
        int choice = scanner.nextInt();

        // Switch-case statement
        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Goodbye");
                break;
            case 3:
                System.out.println("Good morning");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}

package Questions;

import java.util.Scanner;

public class QN16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area of the circle
        double area = Math.PI * radius * radius;

        // Output the area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}

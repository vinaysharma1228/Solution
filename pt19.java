public class pt19 {
    public static void main(String[] args) {
              
        int n = 5; // Number of rows in the top half

        // Top half
        for (int i = 1; i <= n; i++) {
            // Left part of the top half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the left and right parts
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right part of the top half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Left part of the bottom half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the left and right parts
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right part of the bottom half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

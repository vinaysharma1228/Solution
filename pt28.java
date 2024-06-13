public class pt28 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half

        // Print the upper part of the hourglass
        for (int i = 1; i <= n; i++) {
            // Print left asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print right asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the hourglass
        for (int i = n; i >= 1; i--) {
            // Print left asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print right asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

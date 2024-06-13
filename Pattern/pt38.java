public class pt38 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print two spaces for formatting
            }

            // Inner loop for numbers
            int num = i;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}

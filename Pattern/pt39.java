public class pt39 {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pattern

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                // Check if the sum of i and j is even or odd to alternate between '*' and '#'
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}

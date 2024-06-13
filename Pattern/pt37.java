public class pt37 {
    public static void main(String[] args) {
        int size = 9; // Size of the pattern (should be odd for symmetry)

        // Loop through each row
        for (int i = 0; i < size; i++) {
            // Loop through each column
            for (int j = 0; j < size; j++) {
                // Determine whether to print '*' or '@'
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 ||       // Borders
                    (i >= 2 && i <= 4 && j >= 2 && j <= 4) ||                  // Middle @ block
                    (i >= 6 && i <= 8 && j >= 6 && j <= 8 && i + j >= size + 4) // Diagonal @ block
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("@ ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

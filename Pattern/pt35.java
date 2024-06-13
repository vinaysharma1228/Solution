public class pt35 {
    public static void main(String[] args) {
        int n = 6; // Number of rows in the pattern
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            int[] rowNumbers = new int[i];
            // Fill the row with numbers
            for (int j = 0; j < i; j++) {
                rowNumbers[j] = num++;
            }
            // Print the row in ascending order for odd rows, descending for even rows
            if (i % 2 == 0) {
                // Even row: print in descending order
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(rowNumbers[j] + " ");
                }
            } else {
                // Odd row: print in ascending order
                for (int j = 0; j < i; j++) {
                    System.out.print(rowNumbers[j] + " ");
                }
            }
            System.out.println();
        }
    }
}

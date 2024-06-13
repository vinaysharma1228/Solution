public class pt34 {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // Print increasing numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces in the middle
            int spaces = (n - i) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers for the current row, only if i is less than n
            for (int j = i; j >= 1; j--) {
                 
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}

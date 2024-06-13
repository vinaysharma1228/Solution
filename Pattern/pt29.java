public class pt29 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

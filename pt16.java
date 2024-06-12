public class pt16 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        printPascalsTriangle(rows);
    }
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                // Print leading spaces for proper alignment
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                // Print the number and a space
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

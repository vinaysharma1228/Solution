public class PatternPrinter {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 11; // Adjusted to include the last column

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == 3) {
                    System.out.print('*');
                } else if (i == 1 || i == 2) {
                    if (j == 0 || j == 3 || j == 7 || j == 10) {
                        System.out.print('*');
                    } else if (j == 1 || j == 2) {
                        System.out.print('@');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}

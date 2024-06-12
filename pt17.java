public class pt17 {
    public static void main(String[] args) {
        int maxNumber = 4; // The maximum number in the middle row
        printNumberDiamond(maxNumber);
    }

    public static void printNumberDiamond(int maxNumber) {
        // Print the upper part including the middle row
        for (int i = 1; i <= maxNumber; i++) {
            // Print leading spaces
            for (int j = maxNumber; j > i; j--) {
                System.out.print("  ");
            }
            // Print decreasing part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the lower part
        for (int i = maxNumber - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = maxNumber; j > i; j--) {
                System.out.print("  ");
            }
            // Print decreasing part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

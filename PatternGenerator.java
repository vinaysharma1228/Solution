public class PatternGenerator {
    public static void main(String[] args) {
        int n = 3; // Number of blocks
        generatePattern(n);
    }

    public static void generatePattern(int n) {
        int size = 4 * n + 1; // Calculate the total size of the grid

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % (2 * n) == 0 || j % (2 * n) == 0) {
                    // Print '*' for the borders of the blocks
                    System.out.print("* ");
                } else if (i / (2 * n) % 2 == 0 && j / (2 * n) % 2 == 0 && i % (2 * n) < n && j % (2 * n) < n) {
                    // Print '@' inside top-left and bottom-right blocks
                    System.out.print("@ ");
                } else if (i / (2 * n) % 2 == 1 && j / (2 * n) % 2 == 1 && i % (2 * n) < n && j % (2 * n) < n) {
                    // Print '@' inside bottom-left and top-right blocks
                    System.out.print("@ ");
                } else {
                    // Print spaces elsewhere
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

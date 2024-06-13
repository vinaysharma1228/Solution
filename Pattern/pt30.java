public class pt30 {
    public static void main(String[] args) {
        int n = 4; // The largest number in the pattern

        int size = 2 * n - 1; // Total size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}

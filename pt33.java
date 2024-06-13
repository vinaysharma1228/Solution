public class pt33 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        for (int i = 0; i < n; i++) {
            // Calculate the starting character for each row
            char startChar = (char) ('E' - i);
            // Print characters for the current row
            for (char ch = startChar; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

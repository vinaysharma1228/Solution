public class pt36 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the Bell triangle to print

        // Create a 2D array to store the Bell triangle
        int[][] bellTriangle = new int[n][n];

        // Initialize the first element of the first row
        bellTriangle[0][0] = 1;

        // Fill the triangle
        for (int i = 1; i < n; i++) {
            // Set the first element of each row to the last element of the previous row
            bellTriangle[i][0] = bellTriangle[i - 1][i - 1];
            
            // Calculate the remaining elements of the current row
            for (int j = 1; j <= i; j++) {
                bellTriangle[i][j] = bellTriangle[i][j - 1] + bellTriangle[i - 1][j - 1];
            }
        }

        // Print the Bell triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(bellTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

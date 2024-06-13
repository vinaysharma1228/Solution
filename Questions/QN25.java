package Questions;

import java.util.Scanner;

public class QN25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows of the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns of the matrix: ");
        int columns = scanner.nextInt();

        // Input the matrix elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Transpose the matrix
        int[][] transposeMatrix = transpose(matrix);

        // Display transposed matrix
        System.out.println("Transposed Matrix:");
        displayMatrix(transposeMatrix);

        scanner.close();
    }

    // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class pt15 {
    public static void main(String[] args) {
        int n = 10; // height of the upper part of the diamond

        // upper part of the diamond
        for (int i = 0; i < n; i++) {
            // print leading spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // print stars and spaces
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // print leading spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // print stars and spaces
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

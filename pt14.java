public class pt14 {
    public static void main(String[] args) {
        // Christmas Tree
        int n = 5; // height of the tree

        // print the base of the tree
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = n - 1; i > 0; i--) {
            // print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // print stars and spaces
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        
        }
        
        
    }
}

public class pt13 {
    public static void main(String[] args) {

        // Christmas Tree
        int n = 5; // height of the tree
        
        for (int i = 0; i < n-1; i++) {
            // print spaces
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
        
        // print the base of the tree
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public class pt40 {
    public static void main(String[] args) {
        int r=5;
        for (int i = 0; i < r; i++) {
            if (i == 0 || i == r - 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("3");
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    if (j == 0 || j == 2) {
                        System.out.print("3");
                    } else {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }
}

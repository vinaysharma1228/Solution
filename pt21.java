public class pt21 {
    public static void main(String[] args) {
        /* Number increment pattern  */
        int rows=5;
        int number=1;

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

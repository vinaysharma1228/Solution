public class pt8 {

    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int sp=1;sp<=num-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
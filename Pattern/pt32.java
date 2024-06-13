public class pt32 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        char letter = 'a'; // Starting letter
        int temp=1;

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++)
            {
                if(temp%2!=0)
                {
                    System.out.print(letter+" ");
                }
                else{
                    System.out.print(Character.toUpperCase(letter)+" ");
                }

                temp++;
                letter++;
            }
            System.out.println();
        }
    }
}

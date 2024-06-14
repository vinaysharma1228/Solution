public class pt37 {
    public static void main(String[] args) {
       int n=10;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==4 || i==7 || i==10)
                {
                    System.out.print("*");
                }
                else{

                    
                    if(j==1 || j==4 || j==7 || j==10){
                        System.out.print("*");
                    }
                    else if(i==j || i==j+1 || i==j-1){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
                
            }
            System.out.println();
            
        }
    }

}



public class pt24 {
    public static void main(String[] args) {
        /* Hollow Butterfly Pattern  */

        /*
         
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *
             
          
         */
        
         int row=5;

         // upper part....
         for(int i=1;i<=row;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 if(j==1 || j==i)
                 {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
 
             for(int k=1;k<=row-i;k++)
             {
                 System.out.print(" ");
             }
 
             for(int k=1;k<=row-i;k++)
             {
                 System.out.print(" ");
             }
 
             for(int j=1;j<=i;j++)
             {
                 if(j==1 || j==i)
                 {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
 
             
 
 
             System.out.println();
         }
 
         // lower part....
 
          for(int i=1;i<=row;i++)
          {
              for(int j=1;j<=row-i+1;j++)
              {
                  if(j==1 || j==row-i+1)
                  {
                      System.out.print("*");
                  }
                  else{
                      System.out.print(" ");
                  }
              }
  
              for(int k=1;k<=i-1;k++)
              {
                  System.out.print(" ");
              }
  
              for(int k=1;k<=i-1;k++)
              {
                  System.out.print(" ");
              }
  
              for(int j=1;j<=row-i+1;j++)
              {
                  if(j==1 || j==row-i+1)
                  {
                      System.out.print("*");
                  }
                  else{
                      System.out.print(" ");
                  }
              }
  
              
  
  
              System.out.println();
          }
    }
}

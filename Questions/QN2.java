package Questions;

import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check odd/Even: ");
        int num=sc.nextInt();

        if (num%2==0)
        {
            System.out.println(num+" is Even Number.");
        }
        else{
            System.out.println(num+" is Odd Number.");

        }
        sc.close();
    }
}

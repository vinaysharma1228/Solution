package Questions;
import java.util.Scanner;

public class QN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check +ve / -ve: ");
        int num=sc.nextInt();

        if(num==0)
        {
            System.out.println("Number is Zero.");
        }
        else if (num > 0)
        {
            System.out.println("Number is positive number.");
        }
        else{
            System.out.println("Number is Negative number.");

        }

        sc.close();
    }
}

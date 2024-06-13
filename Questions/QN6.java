package Questions;

import java.util.Scanner;

public class QN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert character to lowercase to handle both uppercase and lowercase inputs
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabet letter.");
        }

        scanner.close();
    }
}

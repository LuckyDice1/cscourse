import java.util.Scanner;
import java.util.Arrays;

public class Keypad {
    public static void main(String[] args) {
        String alphabet = "abc,def,ghi,jkl,mno,pqrs,tuv,wxyz";
        String userInput;
        int pos = 0;
        String[] keypad = alphabet.split(",");

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter a letter (enter yes or no)? ");
        String sentinel = input.nextLine().toLowerCase();

        while (sentinel.equals("yes")) {

            System.out.println("Enter a letter: ");

            userInput = input.nextLine().toLowerCase();

            if (alphabet.indexOf(userInput) != -1) {
                for (String a : keypad) {
                    if (a.indexOf(userInput) != -1) {

                        pos = Arrays.asList(keypad).indexOf(a);
                        System.out.printf("The corresponding number is %d\n", pos + 2);

                    }
                }
            } else {

                System.out.printf("%s is an invalid letter.\n", userInput);

            }

            System.out.println("\nDo you want to enter another letter (enter yes or no)? ");
            sentinel = input.nextLine().toLowerCase();

        }
    }
}

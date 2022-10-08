import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        // Declare Variables
        String isbn;
        int b10 = 0;

        // Get First 9 Digits of ISBN Code
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN Code as an integer: ");
        isbn = input.nextLine();

        input.close();

        // Iterate through ISBN Code and get dot product
        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i); // Pulls letter at index
            b10 += (Character.getNumericValue(c) * (i + 1)); // Letter times its (index+1)
        }

        b10 %= 11;
        // Checking for checksum rule
        if (b10 != 10) {
            System.out.printf("The ISBN-10 number is %s%d", isbn, b10);
        } else {
            System.out.printf("The ISBN-10 number is %s%s", isbn, "X");
        }
    }
}
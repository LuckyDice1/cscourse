// This program calculates the total price which includes sales tax. 

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        // identifier declarations
        final double TAX_RATE = 0.07; // PROGRAM CONSTANT

        String item; // INPUT
        double price; // INPUT
        double tax; // OUTPUT
        double total; // OUTPUT

        // create a Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);

        // display prompts and get input
        System.out.print("Item description: ");
        item = scan.nextLine();

        System.out.print("Item price: $");
        // Scanner priceInput = new Scanner(System.in);
        price = scan.nextDouble();

        // calculations
        tax = price * TAX_RATE;
        total = price + tax;

        // display results
        System.out.printf(item + ": $%.2f", price);
        System.out.println("\n");
        System.out.printf("Tax: $%.2f", tax);
        System.out.println("\n");
        System.out.printf("Total: $%.2f", total);
    }
}

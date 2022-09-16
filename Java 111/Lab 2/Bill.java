/* 
Course CSCI 111, Section 2
Student Name: John Asher Williams
Student ID: 010925195
Program: Closed Lab 2
Due Date: 9/9/22

In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.
Program Description: Given the subtotal and gratuity rate, the program computes the gratuity and total
 */

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        // Declare variables
        double subtotal, gratuityRate, gratuity, total;

        Scanner readSubtotal = new Scanner(System.in);
        System.out.println("What is the subtotal? >>> ");
        subtotal = readSubtotal.nextDouble();
        Scanner readGRate = new Scanner(System.in);
        System.out.println("What is the gratuity rate? >>> ");
        gratuityRate = readGRate.nextDouble() / 100; // Convert Percentage to Decimal

        // Close scanners to prevent memory leakage
        readSubtotal.close();
        readGRate.close();

        gratuity = subtotal * gratuityRate;
        total = subtotal + gratuity;
        System.out.printf("The gratuity is $%.2f and the total is $%.2f", gratuity, total);

    }
}

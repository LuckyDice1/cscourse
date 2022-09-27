/* Course: CSCI 111, Section 2
   Student Name: John Asher Williams
   Student ID: 010925195
   Program2
   Due Date: 9/14/22
 
   In keeping with the Honor Code of UM, I have neither given nor received 
   inappropriate assistance from anyone other than the TA or the instructor. 
 
   Program Description: Given 3 coefficients, output the quadratic formulas output +/- 
   depending on the amount of roots. (This is determined via the discriminate)
*/

import java.util.Scanner;

public class RootsWilliams {
    public static void main(String[] args) {
        int a, b, c; // Coeffecients are integers
        double r1, r2, dscrim; // They can be floating decimals

        Scanner input = new Scanner(System.in); // Scanner Object Instantiation

        System.out.println("Enter the A coefficient: ");
        a = input.nextInt(); // Coefficient A

        System.out.println("Enter the B coefficient: ");
        b = input.nextInt(); // Coefficient B

        System.out.println("Enter the C coefficient: ");
        c = input.nextInt(); // Coefficient C

        input.close(); // Closing Scanner Object

        dscrim = Math.pow(b, 2)-(4*a*c); // b^2 - 4ac / Discriminate

        r1 = (-b + Math.sqrt(dscrim)) / 2.0*a; // quadratic +
        r2 = (-b - Math.sqrt(dscrim)) / 2.0*a; // quadratic -

        // Check for 2 roots
        if (dscrim > 0) {
            System.out.printf("%d, %d, %d coefficients have two real roots:\n       r1 = %.2f\n       r2 = %.2f",
            a, b, c, r1, r2);
        } // If not 2 roots check for 1
        else if (dscrim == 0) {
            System.out.printf("%d, %d, %d coefficients have one real root:\n       r = %.2f",
            a, b, c, r1);
        } // If not of the above, print no roots
        else {
            System.out.printf("%d, %d, %d coefficients have no real roots", a, b, c);
        }


    }
}
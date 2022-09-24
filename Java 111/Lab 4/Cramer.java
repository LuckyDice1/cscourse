/* 
Course CSCI 111, Section 2
Student Name: John Asher Williams
Student ID: 010925195
Program: Closed Lab 4
Due Date: 9/23/22

In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.
Program Description: Given the variables a,b,c,d,e, and f display Cramer's rule results
 */

import java.util.Scanner;

public class Cramer {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y, denom;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = input.nextDouble();

        System.out.println("Enter b: ");
        b = input.nextDouble();

        System.out.println("Enter c: ");
        c = input.nextDouble();

        System.out.println("Enter d: ");
        d = input.nextDouble();

        System.out.println("Enter e: ");
        e = input.nextDouble();

        System.out.println("Enter f: ");
        f = input.nextDouble();

        input.close();

        denom = (a * d - b * c);
        x = (e * d - b * f) / denom;
        y = (a * f - e * c) / denom;

        if (denom != 0) {
            System.out.printf("x is %.1f and y is %.1f", x, y);
        } else {
            System.out.println("The equation has no solution");
        }

    }
}
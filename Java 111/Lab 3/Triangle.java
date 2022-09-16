/* 
Course CSCI 111, Section 2
Student Name: John Asher Williams
Student ID: 010925195
Program: Closed Lab 3
Due Date: 9/16/22

In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.
Program Description: Given the 3 sides of a triangle in CM, get the area
 */

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        double s, x, y, z, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side x in inches: ");
        x = input.nextDouble() * 2.54;

        System.out.println("Enter side y in inches: ");
        y = input.nextDouble() * 2.54;

        System.out.println("Enter side z in inches: ");
        z = input.nextDouble() * 2.54;

        input.close();

        s = (1 / 2.0) * (x + y + z);

        area = Math.sqrt((s * (s - x) * (s - y) * (s - z)));

        System.out.printf("For a triangle of sides %.2f cm, %.2f cm, and %.2f cm\nArea = %.2f square cm", x, y, z,
                area);

    }
}

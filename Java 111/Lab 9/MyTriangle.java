import java.lang.Math;
import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        double x, y, z;
        double a;
        boolean valid;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side of the triangle: ");
        x = input.nextDouble();

        System.out.print("Enter second side of the triangle: ");
        y = input.nextDouble();

        System.out.print("Enter third side of the triangle: ");
        z = input.nextDouble();

        input.close();

        valid = isValid(x, y, z);
        if (valid) {
            a = area(x, y, z);
            System.out.printf("\nFor a triangle of sides %.2f, %.2f, and %.2f\n", x, y, z);
            System.out.printf("Area = %.2f square units", a);
        } else {
            System.out.println("\nInvalid triangle!");
        }

    }

    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3) {
            return true;
        }
        return false;
    }

    public static double area(double side1, double side2, double side3) {
        double s = (1 / 2.0) * (side1 + side2 + side3);
        return Math.sqrt((s * ((s - side1) * (s - side2) * (s - side3))));
    }
}
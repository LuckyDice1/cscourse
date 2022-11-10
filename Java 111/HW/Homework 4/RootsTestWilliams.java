/* Course: CSCI 111, Section 2
   Student Name: John Asher Williams
   Student ID: 010925195
   Program 4
   Due Date: 11/7/22
 
   In keeping with the Honor Code of UM, I have neither given nor received 
   inappropriate assistance from anyone other than the TA or the instructor. 
 
   Program Description: given the discriminant, return the amount of roots
*/
import java.util.Scanner;
import java.lang.Math;
public class RootsTestWilliams {
    public static void main(String[] args) {
        // Initialize Variables
        int a, b, c, numRoots;
        double d_sqrt,r1, r2;

        // Get User Inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the A coefficient: ");
        a = input.nextInt();

        System.out.print("Enter the B coefficient: ");
        b = input.nextInt();

        System.out.print("Enter the C coefficient: ");
        c = input.nextInt();

        input.close();

        // Calculate Roots and Get Number of Roots
        numRoots = roots(a, b, c);
        d_sqrt = Math.sqrt((b*b) - (4*a*c));
        r1 = (-b+d_sqrt)/(2*a);
        r2 = (-b-d_sqrt)/(2*a);

        // Display Results
        if (numRoots == 2) {
            System.out.printf("%d, %d, and %d coefficients have two real roots:\n\tr1 = %.2f\n\tr2 = %.2f", a, b, c, r1, r2);
        }
        else if (numRoots == 1) {
            System.out.printf("%d, %d, and %d coefficients have one real roots:\n\tr = %.2f", a, b, c, r1);
        }
        else{
            System.out.printf("%d, %d, and %d coefficients have no real roots", a, b, c);
        }

    }

    public static int roots(int a, int b, int c) {
        // Initialize Variables
        int result = 0;
        double discriminant = (b*b) - (4*a*c);

        // Check number of roots
        if (discriminant > 0) {
            result = 2;
        }
        else if (discriminant == 0) {
            result = 1;
        }
        return result;
    }
}
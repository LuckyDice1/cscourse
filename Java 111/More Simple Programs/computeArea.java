import java.util.Scanner;

public class computeArea {
    public static void main(String[] args) {
        // declare variables
        double radius;
        double pi = 3.1415;
        double area;

        // assign a value to radius
        System.out.println("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();

        // calculate the area of the circle
        area = pi * radius * radius;
        System.out.printf("The area of the circle is %.2f", area);

    }

}

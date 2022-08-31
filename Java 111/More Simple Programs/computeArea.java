import java.util.Scanner;

public class computeArea {
    public static void main(String[] args) {
        // declare variables
        double radius;
        final double PI = 3.14159;
        double area;

        // assign a value to radius
        System.out.println("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();

        // calculate the area of the circle
        area = PI * radius * radius;
        System.out.printf("The area of the circle is %.2f", area);

    }

}

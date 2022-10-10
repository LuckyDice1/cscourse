import java.util.Scanner;

public class JupiterWilliams {
    public static void main(String[] args) {
        // Distance left and Distance Traveled Per Burn Variables Declared
        double d, traveled;

        // Variable to keep track of burn count
        int count = 0;

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get distance in kilometers
        System.out.println("Enter the distance to be traveled in kilometers: ");
        
        // Initiliaze distance and convert from km to meters
        d = input.nextDouble() * 1000;

        input.close();

        // While distance is less than 35 meters, keep burning
        while(d >= 35.0) {
            ++count; // Record 1 burn
            traveled = d*.6; // Get distance traveled from current distance
            d -= traveled; // update current distance
            // display
            System.out.printf("Burn %d: Traveled %.2f meters\n\t%.2f meters left\n", count, traveled, d);
        }

        // Display amount of burns required
        System.out.printf("You made it to Jupiter in %d burns", count);

    }
}
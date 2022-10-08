import java.util.Scanner;

public class DaysMonth {
    public static void main(String[] args) {
        String months[] = new String[] { "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December" };
        int days[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int userMonth, userYear;
        int numDays = 0;
        String realMonth;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month by number (1 for Jan, 2 for Feb, etc.): ");
        userMonth = input.nextInt();
        realMonth = months[userMonth - 1];

        System.out.println("Enter the year: ");
        userYear = input.nextInt();

        input.close();

        // Year % 4; Year % 100 == 0 (no); Year % 400 == 0 (Yes)
        if (userMonth == 2) {
            if (userYear % 4 == 0 && userYear % 100 != 0 || userYear % 400 == 0) {
                numDays = days[userMonth - 1] + 1;
            } else {
                numDays = days[userMonth - 1];
            }
        } else {
            numDays = days[userMonth - 1];
        }

        System.out.printf("%s %d has %d days", realMonth, userYear, numDays);

    }
}
import java.util.Scanner;

public class minMaxSquares {
    public static void main(String[] args) {
        int min, max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum number: ");
        min = input.nextInt();

        System.out.println("Enter the maximum number: ");
        max = input.nextInt();
        System.out.println("Number\tSquare\n");
        for(int i = min; i <= max; i++) {
            System.out.printf("%d\t%d\n", i, i*i);
        }

    }

}
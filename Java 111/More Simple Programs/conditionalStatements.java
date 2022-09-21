import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        grade = input.nextDouble();
        input.close();

        if (grade >= 90.0) {
            System.out.println("Grade is an A");
        } else if (grade >= 80.0) {
            System.out.println("Grade is a B");
        } else if (grade >= 70.0) {
            System.out.println("Grade is a C");
        } else if (grade >= 65.0) {
            System.out.println("Grade is a D");
        } else {
            System.out.println("Grade is a F. You are failing.");
        }
    }
}

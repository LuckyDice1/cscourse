import java.util.Scanner;
import java.util.Random;

public class conditionalStatements {
    public static void main(String[] args) {
        int grade;
        Random rand = new Random();
        grade = rand.nextInt(0, 100);
        System.out.println(grade);
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
import java.util.Scanner;

public class digitSum {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String digits = input.nextLine();

        int dSum = 0;

        for(int i=0; i<digits.length(); i++) {
            System.out.printf("%c\n", digits.charAt(i));
            dSum += Integer.parseInt(digits.charAt(i) + "");
        }

        System.out.printf("The sum of all digits is %d", dSum);





  }
}
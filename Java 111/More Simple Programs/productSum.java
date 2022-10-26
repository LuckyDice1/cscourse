import java.util.Scanner;

public class productSum {
  public static void main(String[] args) {
      int rows = 0;

      int columns = 0;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter number of rows to print: ");

      rows = input.nextInt();




      System.out.println("Enter number of columns to print: ");

      columns = input.nextInt();




      for(int i = 0; i<rows; i++) {

          for(int j = 0; j<=columns; j++) {

              System.out.print("* ");

          }

        System.out.print("\n");

      }
  }
}
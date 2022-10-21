import java.util.Scanner;

public class productSum {
  public static void main(String[] args) {
      int psum = 1;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a max integer");
      int max = input.nextInt();

      for(int i = 1; i <= max; i+=2) {
          psum*=i;
      }
      System.out.printf("The product sum is %d", psum);
  }
}
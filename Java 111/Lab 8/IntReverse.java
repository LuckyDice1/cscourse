import java.util.Scanner;

public class IntReverse {
    public static void main(String[] args) {
        int userNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        userNum = input.nextInt();
        reverse(userNum);

    }

    public static void reverse(int num) {
        String inputNum = Integer.toString(num), rStr = "";
        for (int i = inputNum.length() - 1; i >= 0; i--) {
            rStr += inputNum.charAt(i);
        }
        System.out.printf("The reversal of the number %s is %s.", inputNum, rStr);
    }
}

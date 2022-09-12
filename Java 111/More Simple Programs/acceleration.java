import java.util.Scanner;

public class acceleration {
    public static void main(String[] args) {
        double v0, v1, t, accel;
        Scanner input = new Scanner(System.in);
        System.out.println("V0 = ");
        System.out.println("V1 = ");
        System.out.println("T = ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        input.close();

        accel = (v0 - v1) / t;
        System.out.println(accel);

    }
}

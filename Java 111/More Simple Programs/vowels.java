import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen = input.nextLine().toLowerCase();
        String vowels = "aeiou";
        int v_count = 0;

        for(int i=0; i<sen.length(); i++) {
            for(int j=0; j<vowels.length(); j++) {
                if(sen.charAt(i) == vowels.charAt(j)) {
                    v_count++;
                }
            }
        }

        System.out.printf("The total amount of vowels in the sentence is %d", v_count);
    }
}
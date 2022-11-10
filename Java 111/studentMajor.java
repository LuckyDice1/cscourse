import java.util.Scanner;

public class studentMajor {
    public static void main(String[] args) {
        char userYear;
        String userInput;
        String year = "";
        String  major; 
        char userClass;
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine();
        userClass = userInput.charAt(0);
        userYear = userInput.charAt(1);
        input.close();

        if (userClass == 'M') {
            major = "Mathematics";
        }
        else if (userClass == 'C') {
            major = "Computer Science";
        }
        else if (userClass == 'I')
            major = "Information Technology";
        else {
            major = "Invalid Class Input";
        }
        if (1 <= (int)userYear && (int)userYear<= 4) {
            switch(userYear) {
                case 1:
                    year = "Freshman";
                    break;
                case 2:
                    year = "Sophomore";
                    break;
                case 3:
                    year = "Junior";
                    break;
                case 4:
                    year = "Senior";
                    break;
            }
        }
        else {
            year = "Invalid Year Input";
        }

        System.out.printf("%s %s", major, year);
        
    }
}

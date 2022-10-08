import java.util.Scanner;

public class studentMajor {
    public static void main(String[] args) {
        int year, userYear, userInput;
        String class, userClass;
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine();
        userClass = userInput.charAt(0);
        userYear = userInput.charAt(1);

        if (userClass == "M") {
            class = "Mathematics"
        }
        else if (userClass == "C") {
            class = "Computer Science"
        }
        else if (userClass == "I")
            class = "Information Technology"
        else {
            class = "Invalid Class Input"
        }
        if ('1' <= userYear <= '4') {
            switch(userYear) {
                case "1":
                    year = "Freshman";
                    break;
                case "2":
                    year = "Sophomore";
                    break;
                case "3":
                    year = "Junior";
                    break;
                case "4":
                    year = "Senior";
                    break;
            }
        }
        else {
            year = "Invalid Year Input"
        }

        System.out.printf("%s %s", class, year);
        
    }
}

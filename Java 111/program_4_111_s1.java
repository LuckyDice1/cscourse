import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program_4_111_s1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
            Would you like to get the weighted average of grades or translate English to Panjabi?
            \t1 for Weighted Average
            \t2 for English to Panjabi (To see translations your console/terminal needs a different type of encoding)
            """);
        int userDecision = keyboard.nextInt();
        if (userDecision == 1){
            weightedAverage();
        }
        else if (userDecision == 2) {
            englishToPanjabi(keyboard);
        }
        
    }

    public static void englishToPanjabi(Scanner scannerobj) {

        scannerobj.nextLine();
        int fileLength = 11;
        String[] englishDict = new String[fileLength];
        String[] panjabiDict = new String[fileLength];
        try {
            englishDict = readFile("English.txt", fileLength);
        }
        catch(FileNotFoundException error) {
            System.out.println("The file could not be found.");
            error.printStackTrace();
        }
        try {
            panjabiDict = readFile("Panjabi.txt", fileLength);
        }
        catch(FileNotFoundException error) {
            System.out.println("The file could not be found.");
            error.printStackTrace();
        }

        System.out.println("What English word do you want to translate?: ");
        String userInput = scannerobj.nextLine().toLowerCase();
        scannerobj.close();
        int position = hasWord(englishDict, userInput);
        if(position != -1) {
            System.out.printf("%s means %s in Panjabi", userInput, panjabiDict[position]);
        }
        else {
            System.out.println("The word does not exist in our young English Panjabi dictionary of 11 words.");
        }
        
    }


    public static void weightedAverage() {
        double weighted_total = 0;
        double labScoreTotal = 0;
        double projectScoreTotal = 0;
        double examScoreTotal = 0;
        boolean done = false;

        Scanner input = new Scanner(System.in);
        
        while (!done) {

            System.out.print("""
            What type of grade would you like to enter?
            \t\"l\" for lab 
            \t\"p\" for project
            \t\"e\" for exam
            """);

            String typeOfGrade = input.nextLine().toLowerCase();

            if (typeOfGrade.equals("l")) {
                System.out.println("What was your lab score?: ");
                Double newLabScore = input.nextDouble();
                System.out.println("What was the max score for this lab?: ");
                Double labScoreMax = input.nextDouble();

                input.nextLine();
                if (labScoreMax < newLabScore) {
                    System.out.println("You scored higher than then specified maximum.\nWas this intentional (Yes or No)?: ");
                    String confirmation = input.nextLine().toLowerCase();
                    if (confirmation.equals("yes")) {
                        labScoreTotal+=((newLabScore/labScoreMax)*0.2);

                    }
                    else {
                        System.out.println("Invalid max score.");
                    }

                }
                else {
                    labScoreTotal+=((newLabScore/labScoreMax)*0.2);
                }


            } else if (typeOfGrade.equals("p")) {
                System.out.println("What was your project score?: ");
                Double newProjectScore = input.nextDouble();
                System.out.println("What was the max score for this project?: ");
                Double projectScoreMax = input.nextDouble();
                input.nextLine();
                if (projectScoreMax < newProjectScore) {
                    System.out.println("You scored higher than then specified maximum.\nWas this intentional (Yes or No)?: ");
                    String confirmation = input.nextLine().toLowerCase();
                    if (confirmation.equals("yes")) {
                        projectScoreTotal+=((newProjectScore/projectScoreMax)*0.35);
                    }
                    else {
                        System.out.println("Invalid max score.");
                    }

                }
                else {
                    projectScoreTotal+=((newProjectScore/projectScoreMax)*0.35);
                }


            } else if (typeOfGrade.equals("e")) {
                System.out.println("What was your exam score?: ");
                Double newExamScore = input.nextDouble();
                System.out.println("What was the max score for this exam?: ");
                Double examScoreMax = input.nextDouble();
                input.nextLine();
                if (examScoreMax < newExamScore) {
                    System.out.println("You scored higher than then specified maximum.\nWas this intentional (Yes or No)?: ");
                    String confirmation = input.nextLine().toLowerCase();
                    if (confirmation.equals("yes")) {
                        examScoreTotal+=((newExamScore/examScoreMax)*0.45);
                    }
                    else {
                        System.out.println("Invalid max score.");
                    }

                }
                else {
                    examScoreTotal+=((newExamScore/examScoreMax)*0.45);
                }

            }
            else {
                System.out.println("Invalid Grade type.");
            }


            System.out.println("Would you like to enter another grade? (Yes or No): ");
            String userDecision = input.nextLine().toLowerCase();
            if (userDecision.equals("no")) {
                done = true;
            }
        }

        input.close();

        weighted_total = (labScoreTotal + projectScoreTotal + examScoreTotal)*100;
        System.out.printf("Weighted Average: %.2f", weighted_total);
    }

    public static String[] readFile(String filename, int fileLength) throws
    FileNotFoundException {
        File file = new File(filename);
        String[] fileContents = new String[fileLength];
        Scanner scanFile = new Scanner(file);
        for (int i = 0; i < fileLength; i++) {
            fileContents[i] = scanFile.nextLine();
        }
        scanFile.close();
        return fileContents;

    }

    public static int hasWord(String[] wordArray, String searchWord) {
        for(int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].equals(searchWord)) {
                return i;
            }
        }
        return -1;
    }
}
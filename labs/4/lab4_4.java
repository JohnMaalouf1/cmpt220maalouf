import java.util.Scanner;
// Import Scanner
public class lab4_4 {
    public static void main(String[] args) {
        // Main method
        System.out.println("Hello user, This program counts the amount of Characters in a Sentence!\n"
                + "Please Enter Your Sentence: ");
        // Introductory Statement
        Scanner input = new Scanner(System.in);
        // Scanner class called
        String userInput = input.nextLine();
        String userInputCleaned = userInput.replaceAll("[^a-zA-Z0-9]", "");
        // Takes userInput and cleans it up with Regex/Replacement
        countCharacter(userInputCleaned);
        // countCharacter Method called
    }

    static void countCharacter(String UserInput) {
        // Count countCharacter
        int[] countChar = new int[256];
        // 256 is max array size
        char[] charCount = new char[UserInput.length()];
        int foundChar;
        // Declared Arrays and Variable

        for (int i = 0; i < UserInput.length(); i++)
            countChar[UserInput.charAt(i)]++;
        // For loop going through String

        for (int i = 0; i < UserInput.length(); i++) {
            charCount[i] = UserInput.charAt(i);
            foundChar = 0;
            for (int j = 0; j <= i; j++) {
                if (UserInput.charAt(i) == charCount[j])
                    foundChar++;
            }
            // For loop checking found Characters against new ones
            if (foundChar == 1) {
                System.out.println(UserInput.charAt(i) + " is found " + countChar[UserInput.charAt(i)] + " time(s)");
            }
            // Printing out Characters and times found
        }
    }
}

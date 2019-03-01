/*import java.util.Scanner;
// Import Scanner
public class lab4_4 {
    // Class
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
        countChar(userInputCleaned);
        // CountChar Method called
    }

    public static void countChar(String userInput) {
        // CountChar Method
        int[] countChar = new int[256];
        // Declared Array of 256 ints
        for (int i = 0; i < userInput.length(); i++) {
            countChar[userInput.charAt(i)]++;

        }
        // For loop length of userInput takes char of ever letter
        char[] charCount = new char[userInput.length()];
        System.out.println("");
        // Declare array of Chars, count additional Occurrences of already initialized characters
        for (int i = 0; i < userInput.length(); i++) {
            charCount[i] = userInput.charAt(i);

            System.out.println("The number of times " + userInput.charAt(i) + " occurs is:"  + count[userInput.charAt(i)]);
        }
        // Counts and prints out how many times a character Appears in String
    }
}
*/





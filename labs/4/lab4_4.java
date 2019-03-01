import java.util.Scanner;

public class lab4_4 {

    // CountChar Method
    public static void countChar(String userInput) {
        // Declared Array of 256 ints
        int[] count = new int[256];

        // For loop length of userInput takes char of ever letter
        for (int i = 0; i < userInput.length(); i++)
            count[userInput.charAt(i)]++;
        // Declare array of Chars, count additional Occurrences of already initialized characters
        char[] ch = new char[userInput.length()];
        System.out.println("");

        for (int i = 0; i < userInput.length(); i++) {
            ch[i] = userInput.charAt(i);
            System.out.println("The number of times " + userInput.charAt(i) + " occurs is:"  + count[userInput.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello user, This program counts the amount of Characters in a Sentence!\n"
                + "Please Enter Your Sentence: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String userInputCleaned = userInput.replaceAll("[^a-zA-Z0-9]", "");

        countChar(userInputCleaned);
    }
}


